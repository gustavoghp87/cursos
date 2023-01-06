using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.Services;
using System.Web.Services.Protocols;
using System.Xml;

namespace Servicios
{
    /// <summary>
    /// Descripción breve de Servicios
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class Servicios : System.Web.Services.WebService
    {

        [WebMethod]
        public string HelloWorld()
        {
            return "Hola a todos";
        }

        [WebMethod(Description = "Saluda a la persona")]
        public string Saludar( string nombre )
        {
            return "Hola "+nombre;
        }

        [WebMethod]
        public string GuardarLog( string mensaje )
        {
            Funciones.Logs("LogServicio", mensaje);

            return "OK";
        }

        [WebMethod]
        public int Sumar(int numero_1, int numero_2)
        {
            int suma = numero_1 + numero_2;

            return suma;
        }

        [WebMethod]
        public string[] ObtenerFrutas()
        {
            string[] frutas = new string[3];

            frutas[0] = "Fresa";
            frutas[1] = "Limón";
            frutas[2] = "Melón";

            return frutas;
        }

        [WebMethod]
        public string GuardarFrutas( string[] frutas )
        {
            foreach (string fruta in frutas) {
                Funciones.Logs("Frutas", fruta);
            }

            return "Proceso realizado con éxito";
        }

        [WebMethod]
        public List<Equipos> ObtenerEquipos()
        {
            List<Equipos> equipos = new List<Equipos>();

            equipos.Add(new Equipos { nombre = "Mila", pais = "Italia"});
            equipos.Add(new Equipos { nombre = "AJAX", pais = "Holanda" });

            return equipos;
        }

        [WebMethod]
        public string GuardarEquipos(Equipos[] equipos)
        {
            foreach (Equipos equipo in equipos) {
                Funciones.Logs("Equipos", equipo.nombre + " - " + equipo.pais);
            }

            return "Proceso realizado con éxito";
        }

        [WebMethod]
        public string GuardarXML(string xml)
        {
            XmlDocument data_xml = new XmlDocument();

            data_xml.LoadXml(xml);

            XmlNode documento = data_xml.SelectSingleNode("documento");

            string deporte = documento["deporte"].InnerText;

            Funciones.Logs("XML", "Deporte: "+deporte+"; Equipos: ");

            XmlNodeList node_equipos = data_xml.GetElementsByTagName("equipos");

            XmlNodeList equipos = ((XmlElement)node_equipos[0]).GetElementsByTagName("equipo");

            foreach (XmlElement equipo in equipos) {
                string nombre = equipo.GetElementsByTagName("nombre")[0].InnerText;
                string pais = equipo.GetElementsByTagName("pais")[0].InnerText;

                Funciones.Logs("XML", nombre + " - " + pais);
            }

            return "Proceso realizado con éxito";
        }

        [WebMethod]
        public string RetornarJson()
        {
            dynamic json = new Dictionary<string, dynamic>();
            json.Add("deporte", "Futbol");

            List<Dictionary<string, string>> equipos = new List<Dictionary<string, string>>();

            Dictionary<string, string> equipo1 = new Dictionary<string, string>();
            equipo1.Add("nombre", "Manchester");
            equipo1.Add("pais", "Inglaterra");

            equipos.Add(equipo1);

            Dictionary<string, string> equipo2 = new Dictionary<string, string>();
            equipo2.Add("nombre", "Valencia");
            equipo2.Add("pais", "España");

            equipos.Add(equipo2);

            json.Add("equipos", equipos);


            return JsonConvert.SerializeObject(json);
        }

        [WebMethod]
        public string GuardarJson( string json )
        {
            var data_json = JsonConvert.DeserializeObject<DataJson>(json);

            Funciones.Logs("JSON", "Deporte: "+data_json.deporte+"; Equipos: ");

            foreach (var equipo in data_json.equipos) {
                Funciones.Logs("JSON", equipo.nombre+" - "+equipo.pais);
            }

            return "Proceso realizado con éxito";
        }

        [WebMethod]
        public string ObtenerProductos()
        {
            List<Dictionary<string, string>> json = new List<Dictionary<string, string>>();

            if (!EnlaceSqlServer.ConectarSqlServer()) {
                return "";
            }

            try {

                SqlCommand com = new SqlCommand("SELECT * FROM productos", EnlaceSqlServer.Conexion);
                com.CommandType = CommandType.Text;
                com.CommandTimeout = DatosEnlace.timeOutSqlServer;


                SqlDataReader record = com.ExecuteReader();

                if (record.HasRows) {
                    Dictionary<string, string> row;

                    while (record.Read()) {
                        row = new Dictionary<string, string>();

                        for (int f = 0; f < record.FieldCount; f++) {
                            row.Add(record.GetName(f), record.GetValue(f).ToString());
                        }
                        json.Add(row);
                    }
                }

                record.Close();
                record.Dispose();
                record = null;
                com.Dispose();


            }
            catch (Exception e) {
                Funciones.Logs("ObtenerProductos", e.Message);
                Funciones.Logs("ObtenerProductos_DEBUG", e.StackTrace);
            }

            return JsonConvert.SerializeObject(json);
        }

        [WebMethod]
        public Producto ObtenerProducto(int idproducto)
        {
            Producto producto = new Producto();
            producto.idproducto = 0;
            producto.nombre = "";
            producto.precio = 0;
            producto.stock = 0;

            if (!EnlaceSqlServer.ConectarSqlServer()) {
                return producto;
            }

            try {

                SqlCommand com = new SqlCommand("SELECT TOP 1 * FROM productos WHERE idproducto = "+idproducto, EnlaceSqlServer.Conexion);
                com.CommandType = CommandType.Text;
                com.CommandTimeout = DatosEnlace.timeOutSqlServer;

                SqlDataReader record = com.ExecuteReader();
                if ( record.HasRows && record.Read() ) {
                    producto.idproducto = int.Parse(record.GetValue(0).ToString());
                    producto.nombre = record.GetValue(1).ToString();
                    producto.precio = double.Parse(record.GetValue(2).ToString());
                    producto.stock = int.Parse(record.GetValue(3).ToString());
                }

                record.Close();
                record.Dispose();
                record = null;
                com.Dispose();

            }
            catch (Exception e) {
                Funciones.Logs("ObtenerProducto", e.Message);
                Funciones.Logs("ObtenerProducto_DEBUG", e.StackTrace);
            }

            return producto;
        }

        [WebMethod]
        public string ActualizarProducto(Producto producto)
        {
            string result = "";

            if (!EnlaceSqlServer.ConectarSqlServer())
            {
                return "";
            }

            try {

                SqlCommand com = new SqlCommand("UPDATE productos SET"+
                    " nombre = @Nombre, "+
                    " precio = @Precio, "+
                    " stock = @Stock "+
                    " WHERE "+
                    " idproducto = @IdProducto ", EnlaceSqlServer.Conexion);

                com.Parameters.AddWithValue("@Nombre", producto.nombre);
                com.Parameters.AddWithValue("@Precio", producto.precio);
                com.Parameters.AddWithValue("@Stock", producto.stock);
                com.Parameters.AddWithValue("@IdProducto", producto.idproducto);

                int cant = com.ExecuteNonQuery();

                if (cant == 1)
                {
                    result = "Producto actualizado con éxito";
                }
                else {
                    result = "Error al actualizar el producto";
                }

                com.Dispose();

            }
            catch (Exception e) {
                Funciones.Logs("ActualizarProducto", e.Message);
                Funciones.Logs("ActualizarProducto_DEBUG", e.StackTrace);
            }

            return result;
        }

        [WebMethod]
        public int GuardarProducto(Producto producto)
        {
            int idproducto = 0;

            if (!EnlaceSqlServer.ConectarSqlServer())
            {
                return 0;
            }

            try {

                SqlCommand com = new SqlCommand("INSERT INTO productos ( nombre, precio, stock ) " +
                    " VALUES ( @Nombre, @Precio, @Stock ) "+
                    " ; SELECT CAST(scope_identity() AS int) ", EnlaceSqlServer.Conexion);

                com.Parameters.AddWithValue("@Nombre", producto.nombre);
                com.Parameters.AddWithValue("@Precio", producto.precio);
                com.Parameters.AddWithValue("@Stock", producto.stock);

                idproducto = (int)com.ExecuteScalar();

                com.Dispose();

            }
            catch (Exception e) {
                Funciones.Logs("GuardarProducto", e.Message);
                Funciones.Logs("GuardarProducto_DEBUG", e.StackTrace);
            }

            return idproducto;
        }

        [WebMethod]
        public string EliminarProducto(int idproducto)
        {
            string result = "";

            if (!EnlaceSqlServer.ConectarSqlServer())
            {
                return "";
            }

            try {

                SqlCommand com = new SqlCommand("DELETE FROM productos WHERE idproducto = "+idproducto, EnlaceSqlServer.Conexion);

                int cant = com.ExecuteNonQuery();

                if (cant == 1)
                {
                    result = "Producto eliminado con éxito";
                }
                else {
                    result = "El producto no existe";
                }

                com.Dispose();
            }
            catch (Exception e) {
                Funciones.Logs("EliminarProducto", e.Message);
                Funciones.Logs("EliminarProducto_DEBUG", e.StackTrace);
            }

            return result;
        }

        public AuthUser User;

        [WebMethod]
        [SoapHeader("User")]
        public string ObtenerFecha()
        {
            if (this.User != null && this.User.IsValid()) {
                return DateTime.Now.Year.ToString() + "-" + DateTime.Now.Month.ToString() + "-" + DateTime.Now.Day.ToString();
            }
            else
            {
                return "Credenciales incorrectas";
            }
        }

        [WebMethod]
        public string ObtenerHora()
        {
            return DateTime.Now.Hour.ToString() + ":" + DateTime.Now.Minute.ToString() + ":" + DateTime.Now.Second.ToString();
        }
    }
}
