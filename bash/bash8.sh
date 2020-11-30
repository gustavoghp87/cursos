#!/bin/bash
pwd=$(pwd)

f_hola(){
    echo "hola mundo"
    echo "Cual es tu nombre? "
    read $4
    echo "$1"
    echo "$2"
    echo "$3"
    echo "$4"
}

f_hola hola como estas      # llamado a la función con 3 argumentos


f_banner(){
    echo
    echo -e "\e[0;31m      # colores
		    ******* Recon by Platzi v0.1 *******
    echo
}

f_main(){
    clear
    f_banner
    read
}

while true; do f_main; done
