﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.42000
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Consumo.ServiceReference1 {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(ConfigurationName="ServiceReference1.ServiciosSoap")]
    public interface ServiciosSoap {
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/HelloWorld", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        string HelloWorld();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/HelloWorld", ReplyAction="*")]
        System.Threading.Tasks.Task<string> HelloWorldAsync();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/Saludar", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        string Saludar(string nombre);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/Saludar", ReplyAction="*")]
        System.Threading.Tasks.Task<string> SaludarAsync(string nombre);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/GuardarLog", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        string GuardarLog(string mensaje);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/GuardarLog", ReplyAction="*")]
        System.Threading.Tasks.Task<string> GuardarLogAsync(string mensaje);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/Sumar", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        int Sumar(int numero_1, int numero_2);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/Sumar", ReplyAction="*")]
        System.Threading.Tasks.Task<int> SumarAsync(int numero_1, int numero_2);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ObtenerFrutas", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        string[] ObtenerFrutas();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ObtenerFrutas", ReplyAction="*")]
        System.Threading.Tasks.Task<string[]> ObtenerFrutasAsync();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/GuardarFrutas", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        string GuardarFrutas(string[] frutas);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/GuardarFrutas", ReplyAction="*")]
        System.Threading.Tasks.Task<string> GuardarFrutasAsync(string[] frutas);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ObtenerEquipos", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        Consumo.ServiceReference1.Equipos[] ObtenerEquipos();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ObtenerEquipos", ReplyAction="*")]
        System.Threading.Tasks.Task<Consumo.ServiceReference1.Equipos[]> ObtenerEquiposAsync();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/GuardarEquipos", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        string GuardarEquipos(Consumo.ServiceReference1.Equipos[] equipos);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/GuardarEquipos", ReplyAction="*")]
        System.Threading.Tasks.Task<string> GuardarEquiposAsync(Consumo.ServiceReference1.Equipos[] equipos);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/GuardarXML", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        string GuardarXML(string xml);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/GuardarXML", ReplyAction="*")]
        System.Threading.Tasks.Task<string> GuardarXMLAsync(string xml);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/RetornarJson", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        string RetornarJson();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/RetornarJson", ReplyAction="*")]
        System.Threading.Tasks.Task<string> RetornarJsonAsync();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/GuardarJson", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        string GuardarJson(string json);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/GuardarJson", ReplyAction="*")]
        System.Threading.Tasks.Task<string> GuardarJsonAsync(string json);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ObtenerProductos", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        string ObtenerProductos();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ObtenerProductos", ReplyAction="*")]
        System.Threading.Tasks.Task<string> ObtenerProductosAsync();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ObtenerProducto", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        Consumo.ServiceReference1.Producto ObtenerProducto(int idproducto);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ObtenerProducto", ReplyAction="*")]
        System.Threading.Tasks.Task<Consumo.ServiceReference1.Producto> ObtenerProductoAsync(int idproducto);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ActualizarProducto", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        string ActualizarProducto(Consumo.ServiceReference1.Producto producto);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ActualizarProducto", ReplyAction="*")]
        System.Threading.Tasks.Task<string> ActualizarProductoAsync(Consumo.ServiceReference1.Producto producto);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/GuardarProducto", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        int GuardarProducto(Consumo.ServiceReference1.Producto producto);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/GuardarProducto", ReplyAction="*")]
        System.Threading.Tasks.Task<int> GuardarProductoAsync(Consumo.ServiceReference1.Producto producto);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/EliminarProducto", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        string EliminarProducto(int idproducto);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/EliminarProducto", ReplyAction="*")]
        System.Threading.Tasks.Task<string> EliminarProductoAsync(int idproducto);
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que el mensaje ObtenerFechaRequest tiene encabezados.
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ObtenerFecha", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        Consumo.ServiceReference1.ObtenerFechaResponse ObtenerFecha(Consumo.ServiceReference1.ObtenerFechaRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ObtenerFecha", ReplyAction="*")]
        System.Threading.Tasks.Task<Consumo.ServiceReference1.ObtenerFechaResponse> ObtenerFechaAsync(Consumo.ServiceReference1.ObtenerFechaRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ObtenerHora", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        string ObtenerHora();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ObtenerHora", ReplyAction="*")]
        System.Threading.Tasks.Task<string> ObtenerHoraAsync();
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.7.3190.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://tempuri.org/")]
    public partial class Equipos : object, System.ComponentModel.INotifyPropertyChanged {
        
        private string nombreField;
        
        private string paisField;
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Order=0)]
        public string nombre {
            get {
                return this.nombreField;
            }
            set {
                this.nombreField = value;
                this.RaisePropertyChanged("nombre");
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Order=1)]
        public string pais {
            get {
                return this.paisField;
            }
            set {
                this.paisField = value;
                this.RaisePropertyChanged("pais");
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.7.3190.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://tempuri.org/")]
    public partial class AuthUser : object, System.ComponentModel.INotifyPropertyChanged {
        
        private string userNameField;
        
        private string passwordField;
        
        private System.Xml.XmlAttribute[] anyAttrField;
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Order=0)]
        public string UserName {
            get {
                return this.userNameField;
            }
            set {
                this.userNameField = value;
                this.RaisePropertyChanged("UserName");
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Order=1)]
        public string Password {
            get {
                return this.passwordField;
            }
            set {
                this.passwordField = value;
                this.RaisePropertyChanged("Password");
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlAnyAttributeAttribute()]
        public System.Xml.XmlAttribute[] AnyAttr {
            get {
                return this.anyAttrField;
            }
            set {
                this.anyAttrField = value;
                this.RaisePropertyChanged("AnyAttr");
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.7.3190.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://tempuri.org/")]
    public partial class Producto : object, System.ComponentModel.INotifyPropertyChanged {
        
        private int idproductoField;
        
        private string nombreField;
        
        private double precioField;
        
        private int stockField;
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Order=0)]
        public int idproducto {
            get {
                return this.idproductoField;
            }
            set {
                this.idproductoField = value;
                this.RaisePropertyChanged("idproducto");
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Order=1)]
        public string nombre {
            get {
                return this.nombreField;
            }
            set {
                this.nombreField = value;
                this.RaisePropertyChanged("nombre");
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Order=2)]
        public double precio {
            get {
                return this.precioField;
            }
            set {
                this.precioField = value;
                this.RaisePropertyChanged("precio");
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Order=3)]
        public int stock {
            get {
                return this.stockField;
            }
            set {
                this.stockField = value;
                this.RaisePropertyChanged("stock");
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="ObtenerFecha", WrapperNamespace="http://tempuri.org/", IsWrapped=true)]
    public partial class ObtenerFechaRequest {
        
        [System.ServiceModel.MessageHeaderAttribute(Namespace="http://tempuri.org/")]
        public Consumo.ServiceReference1.AuthUser AuthUser;
        
        public ObtenerFechaRequest() {
        }
        
        public ObtenerFechaRequest(Consumo.ServiceReference1.AuthUser AuthUser) {
            this.AuthUser = AuthUser;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="ObtenerFechaResponse", WrapperNamespace="http://tempuri.org/", IsWrapped=true)]
    public partial class ObtenerFechaResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://tempuri.org/", Order=0)]
        public string ObtenerFechaResult;
        
        public ObtenerFechaResponse() {
        }
        
        public ObtenerFechaResponse(string ObtenerFechaResult) {
            this.ObtenerFechaResult = ObtenerFechaResult;
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface ServiciosSoapChannel : Consumo.ServiceReference1.ServiciosSoap, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class ServiciosSoapClient : System.ServiceModel.ClientBase<Consumo.ServiceReference1.ServiciosSoap>, Consumo.ServiceReference1.ServiciosSoap {
        
        public ServiciosSoapClient() {
        }
        
        public ServiciosSoapClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public ServiciosSoapClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public ServiciosSoapClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public ServiciosSoapClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        public string HelloWorld() {
            return base.Channel.HelloWorld();
        }
        
        public System.Threading.Tasks.Task<string> HelloWorldAsync() {
            return base.Channel.HelloWorldAsync();
        }
        
        public string Saludar(string nombre) {
            return base.Channel.Saludar(nombre);
        }
        
        public System.Threading.Tasks.Task<string> SaludarAsync(string nombre) {
            return base.Channel.SaludarAsync(nombre);
        }
        
        public string GuardarLog(string mensaje) {
            return base.Channel.GuardarLog(mensaje);
        }
        
        public System.Threading.Tasks.Task<string> GuardarLogAsync(string mensaje) {
            return base.Channel.GuardarLogAsync(mensaje);
        }
        
        public int Sumar(int numero_1, int numero_2) {
            return base.Channel.Sumar(numero_1, numero_2);
        }
        
        public System.Threading.Tasks.Task<int> SumarAsync(int numero_1, int numero_2) {
            return base.Channel.SumarAsync(numero_1, numero_2);
        }
        
        public string[] ObtenerFrutas() {
            return base.Channel.ObtenerFrutas();
        }
        
        public System.Threading.Tasks.Task<string[]> ObtenerFrutasAsync() {
            return base.Channel.ObtenerFrutasAsync();
        }
        
        public string GuardarFrutas(string[] frutas) {
            return base.Channel.GuardarFrutas(frutas);
        }
        
        public System.Threading.Tasks.Task<string> GuardarFrutasAsync(string[] frutas) {
            return base.Channel.GuardarFrutasAsync(frutas);
        }
        
        public Consumo.ServiceReference1.Equipos[] ObtenerEquipos() {
            return base.Channel.ObtenerEquipos();
        }
        
        public System.Threading.Tasks.Task<Consumo.ServiceReference1.Equipos[]> ObtenerEquiposAsync() {
            return base.Channel.ObtenerEquiposAsync();
        }
        
        public string GuardarEquipos(Consumo.ServiceReference1.Equipos[] equipos) {
            return base.Channel.GuardarEquipos(equipos);
        }
        
        public System.Threading.Tasks.Task<string> GuardarEquiposAsync(Consumo.ServiceReference1.Equipos[] equipos) {
            return base.Channel.GuardarEquiposAsync(equipos);
        }
        
        public string GuardarXML(string xml) {
            return base.Channel.GuardarXML(xml);
        }
        
        public System.Threading.Tasks.Task<string> GuardarXMLAsync(string xml) {
            return base.Channel.GuardarXMLAsync(xml);
        }
        
        public string RetornarJson() {
            return base.Channel.RetornarJson();
        }
        
        public System.Threading.Tasks.Task<string> RetornarJsonAsync() {
            return base.Channel.RetornarJsonAsync();
        }
        
        public string GuardarJson(string json) {
            return base.Channel.GuardarJson(json);
        }
        
        public System.Threading.Tasks.Task<string> GuardarJsonAsync(string json) {
            return base.Channel.GuardarJsonAsync(json);
        }
        
        public string ObtenerProductos() {
            return base.Channel.ObtenerProductos();
        }
        
        public System.Threading.Tasks.Task<string> ObtenerProductosAsync() {
            return base.Channel.ObtenerProductosAsync();
        }
        
        public Consumo.ServiceReference1.Producto ObtenerProducto(int idproducto) {
            return base.Channel.ObtenerProducto(idproducto);
        }
        
        public System.Threading.Tasks.Task<Consumo.ServiceReference1.Producto> ObtenerProductoAsync(int idproducto) {
            return base.Channel.ObtenerProductoAsync(idproducto);
        }
        
        public string ActualizarProducto(Consumo.ServiceReference1.Producto producto) {
            return base.Channel.ActualizarProducto(producto);
        }
        
        public System.Threading.Tasks.Task<string> ActualizarProductoAsync(Consumo.ServiceReference1.Producto producto) {
            return base.Channel.ActualizarProductoAsync(producto);
        }
        
        public int GuardarProducto(Consumo.ServiceReference1.Producto producto) {
            return base.Channel.GuardarProducto(producto);
        }
        
        public System.Threading.Tasks.Task<int> GuardarProductoAsync(Consumo.ServiceReference1.Producto producto) {
            return base.Channel.GuardarProductoAsync(producto);
        }
        
        public string EliminarProducto(int idproducto) {
            return base.Channel.EliminarProducto(idproducto);
        }
        
        public System.Threading.Tasks.Task<string> EliminarProductoAsync(int idproducto) {
            return base.Channel.EliminarProductoAsync(idproducto);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        Consumo.ServiceReference1.ObtenerFechaResponse Consumo.ServiceReference1.ServiciosSoap.ObtenerFecha(Consumo.ServiceReference1.ObtenerFechaRequest request) {
            return base.Channel.ObtenerFecha(request);
        }
        
        public string ObtenerFecha(Consumo.ServiceReference1.AuthUser AuthUser) {
            Consumo.ServiceReference1.ObtenerFechaRequest inValue = new Consumo.ServiceReference1.ObtenerFechaRequest();
            inValue.AuthUser = AuthUser;
            Consumo.ServiceReference1.ObtenerFechaResponse retVal = ((Consumo.ServiceReference1.ServiciosSoap)(this)).ObtenerFecha(inValue);
            return retVal.ObtenerFechaResult;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<Consumo.ServiceReference1.ObtenerFechaResponse> Consumo.ServiceReference1.ServiciosSoap.ObtenerFechaAsync(Consumo.ServiceReference1.ObtenerFechaRequest request) {
            return base.Channel.ObtenerFechaAsync(request);
        }
        
        public System.Threading.Tasks.Task<Consumo.ServiceReference1.ObtenerFechaResponse> ObtenerFechaAsync(Consumo.ServiceReference1.AuthUser AuthUser) {
            Consumo.ServiceReference1.ObtenerFechaRequest inValue = new Consumo.ServiceReference1.ObtenerFechaRequest();
            inValue.AuthUser = AuthUser;
            return ((Consumo.ServiceReference1.ServiciosSoap)(this)).ObtenerFechaAsync(inValue);
        }
        
        public string ObtenerHora() {
            return base.Channel.ObtenerHora();
        }
        
        public System.Threading.Tasks.Task<string> ObtenerHoraAsync() {
            return base.Channel.ObtenerHoraAsync();
        }
    }
}
