#!/bin/bash        [le dice al interpretador qué aplicación lo va a ejecutar]

HOLA="hola mundo"

echo $HOLA

# no usar espacios
# :! bash bash.sh   (ejecutar desde vim)

#[en bash:] export CURSO="curso de bash script"   [almacena la variable en los archivos de la aplicación]
#[se la invoca en un .sh] echo $CURSO
#[en un .sh se la puede modificar] CURSO="otro curso"

UNO=1
DOS=$UNO+$UNO
ECHO $DOS      #[va a imprimir 1+1]

declare -i SEIS=3+3     #[i de int integer]
echo $SEIS              #[va a imprimir 6]

SIETE=`expr 4 + 3`      #espacios obligatorios
echo $SIETE

c=BB34
d=${c/BB/23}             # Substitute "23" for "BB".
                         # This makes $d an integer.
echo "d = $d"  
