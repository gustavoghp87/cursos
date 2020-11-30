# script pasivo de reconocimiento y mapeo de red
#!/bin/bash

#variables globales

home=$(pwd)
web=firefox

f_banner(){
    echo
    echo -e "\e[0;31m
		    *** Recon by Platzi v0.1 *** "
    echo
}

f_recon(){
    echo -n "Qué tipo de reconocimiento quieres ejecutar: "
    echo
    echo "1. PASIVO"
    echo "2. ACTIVO"
    echo "3. PERSONAS"
    echo "4. Regresar al menú"
    read opcion
    case $opcion in
	1)
	    echo "En Construcción"
	    f_main ;;
	2)
	    echo "En Construcción"
	    f_main ;;
	3)
	    echo -n "Cual es el nombre?"
	    read nombre
	    if [[ -z $nombre ]]; then     # que no sea 0 vacío
	         f_error
	    fi
	    echo "Cual es el apellido?"
	    read apellido
	    if [[ -z $apellido ]]; then
	        f_error
	    fi
	    echo "Cual es el pais donde quiere realizar la busqueda? "
	    read pais
	    if [[ -z $pais ]]; then
	        f_error
	    fi
	sleep 2
	$web https://pipl.com/search/?q=$nombre+$pais\&l=$pais\&sloc=\&in=5 &
	$web https://www.linkedin.com/pub/dir/?first=$nombre\&last=$apellido\&search=Search &
	4)
	    f_main;;
	*)
	    f_error;;
    esac
}

f_main(){
    clear
    f_banner
    if [ ! -d $HOME/datos ]; do
	mkdir -p $HOME/datos
    fi
    echo -e "\e[1;34m 1. RECONOCIMIENTO \1xb[0m"
    echo
    echo -e "\e[1;34m 2. ESCANEO \e[0m"
    echo
    echo -n "Qué opción quieres ejecutar? "
    read opcion
    case $opcion in
	1)
	    f_recon;;
	2)
	    f_scan;;
	*)
	    f_error;;
    esac
}




while true; do f_main; done

