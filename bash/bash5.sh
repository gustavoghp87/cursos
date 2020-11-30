# control de flujo
# condiciones: test  o  [ ]

test "$NOMBRE" == "COKO"       # == != > < >= <=
["$DINERO" -eq "1000"]         # -eq -ne -gt -lt -ge -le
test -f /etc/passwd            # -f -d -L -r -w -x

echo "Digite un numero: "
read NUMERO

if [ "$NUMERO" -eq 1 ]; then            #espacios obligatorios
    echo "Seleccionaste el numero 1"
else
    echo "Seleccionaste el numero $NUMERO"
fi


pwd=$(pwd)
echo "Digite el nombre del script: "
read SCRIPT
echo "Buscando el archivo $SCRIPT"
if [ -f $SCRIPT ]; then
    cat $SCRIPT
else
    echo "El archivo $SCRIPT no existe"
fi


echo "Digite el nombre del script: "
read SCRIPT
echo "Buscando el archivo $SCRIPT"
if [ -f $SCRIPT ]; then
    cat $SCRIPT
elif [ $SCRIPT == "/tmp/coko.txt" ]:then
    echo "Creando el archivo $SCRIPT"
    touch $SCRIPT
    if [ -f $SCRIPT ] then
	echo "Archivo creado#
    fi
else
    echo "El archivo $SCRIPT no existe"
fi

