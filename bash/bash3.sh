#!/bin/bash

echo "Seleccione un menu: "
echo "1) Menu 1 "
echo
printf "2) Menu 2\n"        # para usar el salto de linea barra n hay que usar printf
read VALOR
echo 'Seleccionaste la opcion $VALOR'    # comilla simple toma texto |MAL|
echo "Seleccionaste la opcion $VALOR"    # comilla doble toma el valor


echo "Seleccionaste la opcion $1 $2 $3 "   # Argumento 0 es el nombre del archivo
# se ejecuta: :! bash bash3.sh uno dos tres
# ... "Seleccionaste la opción uno dos tres"

shift    #descarta el primer argumento
echo "Seleccionaste la opcion $1 $2 $3 "   # Argumento 0 es el nombre del archivo
# se ejecuta: :! bash bash3.sh uno dos tres
# ... "Seleccionaste la opción dos tres"

#  $*  toma todo
#  $@  todos los argumentos
#  $_  comando ejecutado anteriormente
#  $$  valor (PID) del proceso shell actual

echo $0 $# $* $@ $_ $$ $?
# se ejecuta: :! bash bash3.sh uno dos tres
# ... "bash3.sh 2 dos tres dos tres Seleccionaste la opcion dos tres 17474 0"

