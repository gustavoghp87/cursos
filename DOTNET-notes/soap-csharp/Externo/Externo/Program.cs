using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.ServiceModel.Channels;
using System.Text;
using System.Threading.Tasks;

namespace Externo
{
    class Program
    {
        static void Main(string[] args)
        {
            ServiceReference1.serviciosPortTypeClient client = new ServiceReference1.serviciosPortTypeClient();

            //string result = client.HelloWorld();

            //string result = client.Saludar("Ana");

            //string result = client.GuardarLog("Mensaje desde .NET");

            //int result = client.Sumar(4,3);
            /*
            string[] frutas = client.ObtenerFrutas();

            foreach (string fruta in frutas) {
                Console.WriteLine(fruta);
            }
            */
            /*
            string[] frutas = new string[3];

            frutas[0] = "Mango";
            frutas[1] = "Pera";
            frutas[2] = "Banano";

            string result = client.GuardarFrutas(frutas);
            */
            /*
            ServiceReference1.Equipos[] equipos = client.ObtenerEquipos();

            foreach (ServiceReference1.Equipos equipo in equipos) {
                Console.WriteLine(equipo.nombre+" - "+equipo.pais);
            }
            */
            /*
            ServiceReference1.Equipos[] equipos = new ServiceReference1.Equipos[2];

            equipos[0] = new ServiceReference1.Equipos() { nombre = "Sevilla", pais = "España" };
            equipos[1] = new ServiceReference1.Equipos() { nombre = "Chelsea", pais = "Inglaterra" };

            string result = client.GuardarEquipos(equipos);
            */

            //string result = client.GuardarXML("<?xml version='1.0' encoding='UTF-8'?><documento><deporte><![CDATA[Futbol]]></deporte><equipos><equipo><nombre><![CDATA[Ajax]]></nombre><pais><![CDATA[Holanda]]></pais></equipo><equipo><nombre><![CDATA[Valencia]]></nombre><pais><![CDATA[España]]></pais></equipo></equipos></documento>");
            /*
            string result = client.RetornarJson();

            dynamic data_json = JsonConvert.DeserializeObject(result);

            Console.WriteLine(data_json.deporte);

            foreach (dynamic equipo in data_json.equipos) {
                Console.WriteLine(equipo.nombre + " - " + equipo.pais);
            }
            */

            //string result = client.GuardarJson("{\"deporte\":\"Futbol\",\"equipos\":[{\"nombre\":\"AJAX\",\"pais\":\"Holanda\"},{\"nombre\":\"Real Madrid\",\"pais\":\"España\"}]}");
            /*
            string result = client.ObtenerProductos();

            dynamic productos = JsonConvert.DeserializeObject(result);

            foreach (dynamic producto in productos)
            {
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
            producto.nombre = "PS4 PRO";
            producto.precio = 720;
            producto.stock = 15;

            string result = client.ActualizarProducto(producto);
            */
            /*
            ServiceReference1.Producto producto = new ServiceReference1.Producto();

            producto.nombre = "Monitor";
            producto.precio = 410;
            producto.stock = 7;

            int result = client.GuardarProducto(producto);
            */

            //string result = client.EliminarProducto(4);
            /*
            using (var scope = new OperationContextScope(client.InnerChannel)) {
                AuthUser authUser = new AuthUser();
                authUser.UserName = "admin";
                authUser.Password = "123";

                MessageHeader messageHeader = MessageHeader.CreateHeader("AuthUser", "http://ejemplo.com/", authUser);
                OperationContext.Current.OutgoingMessageHeaders.Add(messageHeader);

                string result = client.ObtenerFecha();

                Console.WriteLine(result);
            }
            */

            client.ClientCredentials.UserName.UserName = "admin";
            client.ClientCredentials.UserName.Password = "321";

            using (new OperationContextScope(client.InnerChannel))
            {

                SoapAuthHeader.Create(client.ClientCredentials.UserName.UserName, client.ClientCredentials.UserName.Password);

                string result = client.ObtenerHora();

                Console.WriteLine(result);
            }

            Console.ReadKey();
        }
    }
}
