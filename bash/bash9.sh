#!/bin/bash         # vsp divide la pantalla verticalmente
HOME=$(pwd)          # sp divide la pantalla horizontalmente
DATOS=$HOME/datos/

f_error(){
    echo
    echo -e "\e[1;31m		******* Opcion invalida *******"
    echo
    sleep 2
    f_main
}

f_escaneo(){
    echo "En construcción
    read
    f_main
}

f_recon(){
    echo "En CONSTRUCCION"
    read
    f_main
}

f_banner(){
    echo
    echo -e "\e[0;31m      # colores
		    ******* Recon by Platzi v0.1 ******* \x1b[0m"    # cierre de color, que podría no estar
    echo
}

f_main(){
    clear
    f_banner
    read
    if [ ! -d $DATOS ]; then
	mkdir -p $DATOS
    fi
    echo -e "Bienvenidos al script de reconocimiento de Platzi"
    echo
    echo -e "Qué opción desea ejecutar? "
    echo
    echo -e "1) RECONOCIMIENTO"
    echo
    echo -e "2) ESCANEO DE HOSTS"
    echo
    read OPCION
    case $OPCION in
	1)
	    f_recon
	    ;;
	2)
	    f_escaneo
	    ;;
	99)
	    exit
	    ;;
	*)
	    f_error
	    ;
    esac
}

while true; do f_main; done
