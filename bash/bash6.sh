pwd=$(pwd)
echo "Digite el nombre del script: "
read SCRIPT

case $SCRIPT in                         # es un switch
    "COKO")
	echo "Seleccionaste coko"
	;;
    "YEISON")
	echo "Seleccionaste yeison"
	;;
    1)
	echo "es un numero"
    ;;
    *)
	echo "Seleccionaste $SCRIPT"
	;;
esac

# No es ideal, no es perfecto. El estilo -si uno lo encuentra o lo inventa- es propio. 
# El estilo es el error trabajado hasta que parezca hecho a propósito.
# Nada menos ideal que el error... eso que repetimos muchas veces... pero trabajado.
# Para intentar de esos errores repetidos, sacar y extraer lo mejor de lo inevitable de nosotros mismos.
# Para intentar extraer lo mejor de lo que no podemos o no sabemos hacer de otra manera.
