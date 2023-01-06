<?php

class Funciones{

    public static function Logs( $nombre_archivo, $ubicacion, $descripcion){

        $carpeta = $ubicacion.date('Y').'/'.date('m').'/'.date('d').'/';

        if( !file_exists($ubicacion.date('Y').'/'.date('m').'/'.date('d')) ){
            mkdir($ubicacion.date('Y').'/'.date('m').'/'.date('d'), 0777, true);
        }

        $mi_archivo = fopen( $carpeta.$nombre_archivo.'.txt', "a") or die("Archivo inaccesible!");
        fwrite($mi_archivo, date("Y-m-d H:i:s").' >>> '.$descripcion."\r\n");
        fclose($mi_archivo);        
    }

}