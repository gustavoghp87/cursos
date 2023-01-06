<?php

include("system/conexion.php");

require_once('nusoap-master/src/nusoap.php');

$conexion = new Conexion("logs/");
$conexion->conectar();

function validate_user()
{
    if($_SERVER['PHP_AUTH_USER'] == "admin" && $_SERVER['PHP_AUTH_PW'] == "321") 
    {
        return true;
    }
    else
    {
        return false;
    }
}

$server = new soap_server();
$server->configureWSDL("servicios", "urn:servicios");
$server->soap_defencoding = 'UTF-8';
$server->decode_utf8 = false;

$server->responseHeaders = array(
    'AuthUser' => array(
        'UserName' => 'admin',
        'Password' => '123'
    )
);

function HelloWorld() {
    return 'Hola a todos';
}

function Saludar( $nombre ){
    return 'Hola '.$nombre;
}

function GuardarLog( $mensaje ){

    Funciones::Logs("LogServicio", "logs/", $mensaje);

    return 'Ok';
}

function Sumar( $numero_1, $numero_2 ){

    $suma = $numero_1 + $numero_2;

    return $suma;
}

function ObtenerFrutas(){

    $result = array('Pera','Manzana','Fresa');

    return $result;
}

function GuardarFrutas( $frutas ){

    for($f = 0; $f < count($frutas); $f++) {
        Funciones::Logs("Frutas", "logs/", $frutas[$f]);
    }

    return 'Proceso realizado con éxito';
}

function ObtenerEquipos(){

    $result = array();

    $result[] = array( 'nombre' => 'Barcelona', 'pais' => 'España');
    $result[] = array( 'nombre' => 'Juventus', 'pais' => 'Italia');

    return $result;
}

function GuardarEquipos( $equipos ){

    for($f = 0; $f < count($equipos); $f++) {
        Funciones::Logs("Equipos", "logs/", $equipos[$f]['nombre'].' - '.$equipos[$f]['pais']);
    }

    return 'Proceso realizado con éxito';
}

function GuardarXML( $xml ){

    $data_xml = simplexml_load_string($xml);

    $deporte = $data_xml->deporte;
    $equipos = $data_xml->equipos->equipo;

    Funciones::Logs("XML", "logs/", 'Deporte: '.$deporte.'; Equipos: ');

    foreach ($equipos as $equipo){
        Funciones::Logs("XML", "logs/", $equipo->nombre.' - '.$equipo->pais);
    }

    return 'Proceso realizado con éxito';
}

function RetornarJson(){
    $json = array();

    $json['deporte'] = 'Futbol';
    $json['equipos'][]  = array( 'nombre' => 'Manchester', 'pais' => 'Inglaterra');
    $json['equipos'][]  = array( 'nombre' => 'Inter', 'pais' => 'Italia');

    return json_encode($json);
}

function GuardarJson($json){
    $data_json = json_decode($json, true);

    $deporte = $data_json['deporte'];
    $equipos = $data_json['equipos'];

    Funciones::Logs("JSON", "logs/", 'Deporte: '.$deporte.'; Equipos: ');

    for($f = 0; $f < count($equipos); $f++) {
        Funciones::Logs("JSON", "logs/", $equipos[$f]['nombre'].' - '.$equipos[$f]['pais']);
    }

    return 'Proceso realizado con éxito';
}

function ObtenerProductos(){
    global  $conexion;

    $json = array();

    $resultado = $conexion->ejecutarConsulta("
        SELECT * FROM productos
    ");

    $cnt = 0;

    foreach($resultado as $fila){

        foreach($fila as $key => $value){
            $json[$cnt][$key] = $value;
        }

        $cnt++;
    }

    return json_encode($json);
}

function ObtenerProducto($idproducto){
    global  $conexion;

    $producto = array(
        'idproducto' => 0,
        'nombre' => '',
        'precio' => 0,
        'stock' => 0
    );

    $resultado = $conexion->ejecutarConsulta("
        SELECT * FROM productos WHERE idproducto = ".$idproducto." LIMIT 1
    ");

    foreach($resultado as $fila){
        $producto['idproducto'] = $fila['idproducto'];
        $producto['nombre'] = $fila['nombre'];
        $producto['precio'] = $fila['precio'];
        $producto['stock'] = $fila['stock'];
    }

    return $producto;
}

function ActualizarProducto($producto){
    global  $conexion;

    $resultado = $conexion->ejecutarConsulta("
        UPDATE productos SET
        nombre = '".addslashes($producto['nombre'])."',
        precio = '".$producto['precio']."',
        stock = '".$producto['stock']."'
        WHERE 
        idproducto = '".$producto['idproducto']."'
    ");

    if( $resultado == true ){
        return 'Producto actualizado con éxito';
    }else{
        return 'Error al actualizar el producto';
    }
}

function GuardarProducto($producto){
    global  $conexion;

    $idproducto = 0;

    $conexion->ejecutarConsulta("
        INSERT INTO productos ( nombre, precio, stock)
        VALUES ('".addslashes($producto['nombre'])."','".$producto['precio']."','".$producto['stock']."')
    ");

    $resultado = $conexion->ejecutarConsulta("
        SELECT * FROM productos ORDER BY idproducto DESC LIMIT 1
    ");

    foreach($resultado as $fila){
        $idproducto = $fila['idproducto'];
    }

    return $idproducto;
}

function EliminarProducto($idproducto){
    global  $conexion;

    $resultado = $conexion->ejecutarConsulta("
        DELETE FROM productos WHERE idproducto = '".$idproducto."'
    ");

    if( $resultado == true ){
        return 'Producto eliminado con éxito';
    }else{
        return 'Error al eliminar el producto';
    }
}

function ObtenerFecha(){
    global $server;

    $responseHeaders = $server->responseHeaders;
    $requestHeaders = $server->requestHeader;

    if (
        $responseHeaders['AuthUser']['UserName'] == $requestHeaders['AuthUser']['UserName'] &&
        $responseHeaders['AuthUser']['Password'] == $requestHeaders['AuthUser']['Password']
    ) {
        return date('Y-m-d');
    }else {
        return 'Credenciales incorrectas';
    }
}

function ObtenerHora(){

    if (
        validate_user()
    ) {
        return date('H:i:s');
    }else {
        return 'Credenciales incorrectas';
    }
}

$server->register(
    'HelloWorld', 
    array(), 
    array('return' => 'xsd:string'), 
    'urn:servicios', 
    'urn:servicios#HelloWorld', 
    'rpc', 
    'encoded', 
    '' 
);

$server->register(
    'Saludar', 
    array('nombre' => 'xsd:string'), 
    array('return' => 'xsd:string'), 
    'urn:servicios', 
    'urn:servicios#Saludar', 
    'rpc', 
    'encoded', 
    'Saluda a la persona' 
);

$server->register(
    'GuardarLog', 
    array('mensaje' => 'xsd:string'), 
    array('return' => 'xsd:string'), 
    'urn:servicios', 
    'urn:servicios#GuardarLog', 
    'rpc', 
    'encoded', 
    'Guardar Log' 
);

$server->register(
    'Sumar', 
    array('numero_1' => 'xsd:int', 'numero_2' => 'xsd:int'), 
    array('return' => 'xsd:int'), 
    'urn:servicios', 
    'urn:servicios#Sumar', 
    'rpc', 
    'encoded', 
    'Sumar 2 números' 
);

$server->register(
    'ObtenerFrutas', 
    array(), 
    array('return' => 'tns:ArrayOfString'), 
    'urn:servicios', 
    'urn:servicios#ObtenerFrutas', 
    'rpc', 
    'encoded', 
    '' 
);

$server->wsdl->addComplexType(
    'ArrayOfString',
    'complexType',
    'array',
    '',
    'SOAP-ENC:Array',
    array(),
    array(
        array('ref'=>'SOAP-ENC:arrayType','wsdl:arrayType'=>'xsd:string[]')
    ),
    'xsd:string'
);

$server->register(
    'GuardarFrutas', 
    array('frutas' => 'tns:ArrayOfString'), 
    array('return' => 'xsd:string'), 
    'urn:servicios', 
    'urn:servicios#GuardarFrutas', 
    'rpc', 
    'encoded', 
    '' 
);

$server->register(
    'ObtenerEquipos', 
    array(), 
    array('return' => 'tns:EquiposArray'), 
    'urn:servicios', 
    'urn:servicios#ObtenerEquipos', 
    'rpc', 
    'encoded', 
    '' 
);

$server->wsdl->addComplexType(
    'Equipos',
    'complexType',
    'struct',
    'all',
    '',
    array(
        'nombre' => array('name' => 'nombre', 'type' => 'xsd:string'),
        'pais' => array('name' => 'pais', 'type' => 'xsd:string')
    )
);

$server->wsdl->addComplexType(
    'EquiposArray',
    'complexType',
    'array',
    '',
    'SOAP-ENC:Array',
    array(),
    array(
        array('ref'=>'SOAP-ENC:arrayType','wsdl:arrayType'=>'tns:Equipos[]')
    ),
    'tns:Equipos'
);

$server->register(
    'GuardarEquipos', 
    array('equipos' => 'tns:EquiposArray'), 
    array('return' => 'xsd:string'), 
    'urn:servicios', 
    'urn:servicios#GuardarEquipos', 
    'rpc', 
    'encoded', 
    '' 
);

$server->register(
    'GuardarXML', 
    array('xml' => 'xsd:string'), 
    array('return' => 'xsd:string'), 
    'urn:servicios', 
    'urn:servicios#GuardarXML', 
    'rpc', 
    'encoded', 
    '' 
);

$server->register(
    'RetornarJson', 
    array(), 
    array('return' => 'xsd:string'), 
    'urn:servicios', 
    'urn:servicios#RetornarJson', 
    'rpc', 
    'encoded', 
    '' 
);

$server->register(
    'GuardarJson', 
    array('json' => 'xsd:string'), 
    array('return' => 'xsd:string'), 
    'urn:servicios', 
    'urn:servicios#GuardarJson', 
    'rpc', 
    'encoded', 
    '' 
);

$server->register(
    'ObtenerProductos', 
    array(), 
    array('return' => 'xsd:string'), 
    'urn:servicios', 
    'urn:servicios#ObtenerProductos', 
    'rpc', 
    'encoded', 
    '' 
);

$server->register(
    'ObtenerProducto', 
    array('idproducto' => 'xsd:int'), 
    array('return' => 'tns:Producto'), 
    'urn:servicios', 
    'urn:servicios#ObtenerProducto', 
    'rpc', 
    'encoded', 
    '' 
);

$server->wsdl->addComplexType(
    'Producto',
    'complexType',
    'struct',
    'all',
    '',
    array(
        'idproducto' => array('name' => 'idproducto', 'type' => 'xsd:int'),
        'nombre' => array('name' => 'nombre', 'type' => 'xsd:string'),
        'precio' => array('name' => 'precio', 'type' => 'xsd:double'),
        'stock' => array('name' => 'stock', 'type' => 'xsd:int')
    )
);

$server->register(
    'ActualizarProducto', 
    array('producto' => 'tns:Producto'), 
    array('return' => 'xsd:string'), 
    'urn:servicios', 
    'urn:servicios#ActualizarProducto', 
    'rpc', 
    'encoded', 
    '' 
);

$server->register(
    'GuardarProducto', 
    array('producto' => 'tns:Producto'), 
    array('return' => 'xsd:int'), 
    'urn:servicios', 
    'urn:servicios#GuardarProducto', 
    'rpc', 
    'encoded', 
    '' 
);

$server->register(
    'EliminarProducto', 
    array('idproducto' => 'xsd:int'), 
    array('return' => 'xsd:string'), 
    'urn:servicios', 
    'urn:servicios#EliminarProducto', 
    'rpc', 
    'encoded', 
    '' 
);

$server->register(
    'ObtenerFecha', 
    array(), 
    array('return' => 'xsd:string'), 
    'urn:servicios', 
    'urn:servicios#ObtenerFecha', 
    'rpc', 
    'encoded', 
    '' 
);

$server->register(
    'ObtenerHora', 
    array(), 
    array('return' => 'xsd:string'), 
    'urn:servicios', 
    'urn:servicios#ObtenerHora', 
    'rpc', 
    'encoded', 
    '' 
);


if (!isset($HTTP_RAW_POST_DATA)) $HTTP_RAW_POST_DATA = file_get_contents( 'php://input' );

$server->service($HTTP_RAW_POST_DATA);