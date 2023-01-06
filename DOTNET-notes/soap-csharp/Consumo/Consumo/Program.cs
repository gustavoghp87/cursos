using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace Consumo
{
    class Program
    {
        static void Main(string[] args)
        {
            ServiceReference1.ServiciosSoapClient client = new ServiceReference1.ServiciosSoapClient();

            //string result = client.HelloWorld();

            //string result = client.Saludar("Pepe");

            //string result = client.GuardarLog("Mensaje de consola");

            //int result = client.Sumar( 3, 5);
            /*
            string[] frutas = client.ObtenerFrutas().ToArray();

            foreach (string fruta in frutas) {
                Console.WriteLine(fruta);
            }
            */
            /*
            ServiceReference1.ArrayOfString frutas = new ServiceReference1.ArrayOfString() { "Coco", "Cereza", "Almendra" };

            string result = client.GuardarFrutas(frutas);
            */
            /*
            ServiceReference1.Equipos[] equipos = client.ObtenerEquipos();

            foreach (ServiceReference1.Equipos equipo in equipos) {
                Console.WriteLine(equipo.nombre + " - " + equipo.pais);
            }
            */
            /*
            ServiceReference1.Equipos[] equipos = new ServiceReference1.Equipos[2];

            equipos[0] = new ServiceReference1.Equipos() { nombre = "Sevilla", pais = "España" };
            equipos[1] = new ServiceReference1.Equipos() { nombre = "Chelsea", pais = "Inglaterra"};

            string result = client.GuardarEquipos(equipos);
            */

            //string result = client.GuardarXML("<?xml version='1.0' encoding='UTF-8'?><documento><deporte><![CDATA[Futbol]]></deporte><equipos><equipo><nombre><![CDATA[Ajax]]></nombre><pais><![CDATA[Holanda]]></pais></equipo><equipo><nombre><![CDATA[Valencia]]></nombre><pais><![CDATA[España]]></pais></equipo></equipos></documento>");

            //string result = client.RetornarJson();
            /*
            dynamic json = new Dictionary<string, dynamic>();
            json.Add("deporte", "Futbol");

            List<Dictionary<string, string>> equipos = new List<Dictionary<string, string>>();

            Dictionary<string, string> equipo1 = new Dictionary<string, string>();
            equipo1.Add("nombre", "Chelsea");
            equipo1.Add("pais", "Inglaterra");

            equipos.Add(equipo1);

            Dictionary<string, string> equipo2 = new Dictionary<string, string>();
            equipo2.Add("nombre", "Barcelona");
            equipo2.Add("pais", "España");

            equipos.Add(equipo2);

            json.Add("equipos", equipos);

            //string result = client.GuardarJson(JsonConvert.SerializeObject(json));

            string result = client.GuardarJson("{\"deporte\":\"Futbol\",\"equipos\":[{\"nombre\":\"AJAX\",\"pais\":\"Holanda\"},{\"nombre\":\"Real Madrid\",\"pais\":\"España\"}]}");
            */
            /*
            string result = client.ObtenerProductos();

            dynamic productos = JsonConvert.DeserializeObject(result);

            foreach (dynamic producto in productos) {
                Console.WriteLine(producto);
            }
            */
            /*
            ServiceReference1.Producto result = client.ObtenerProducto(2);

            Console.WriteLine(result.idproducto);
            Console.WriteLine(result.nombre);
            Console.WriteLine(result.precio);
            Console.WriteLine(result.stock);
            */
            /*
            ServiceReference1.Producto producto = new ServiceReference1.Producto();
            producto.idproducto = 2;
            producto.nombre = "LCD";
            producto.precio = 750.33;
            producto.stock = 7;

            string result = client.ActualizarProducto(producto);
            */
            /*
            ServiceReference1.Producto producto = new ServiceReference1.Producto();
            producto.nombre = "PS4";
            producto.precio = 357;
            producto.stock = 3;

            int result = client.GuardarProducto(producto);
            */

            //string result = client.EliminarProducto(6);

            //ServiceReference1.AuthUser authUser = new ServiceReference1.AuthUser { UserName = "admin", Password = "123" };

            //string result = client.ObtenerFecha(authUser);

            client.ClientCredentials.UserName.UserName = "MICHAEL-LAPTOP";
            client.ClientCredentials.UserName.Password = "pepe123";

            using (new OperationContextScope(client.InnerChannel)) {

                SoapAuthHeader.Create(client.ClientCredentials.UserName.UserName, client.ClientCredentials.UserName.Password);

                string result = client.ObtenerHora();

                Console.WriteLine(result);
            }

               

            Console.ReadKey();
        }
    }
}
