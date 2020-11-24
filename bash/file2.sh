
VAR="max"

if [ $VAR = "max" ]; then                    # espacios obligatorios
    echo "yes"
elif [ $VAR = "min" ]; then
    echo "no but yes"
elif [ -z $VAR ]; then
    echo "VAR's empty"
else
    echo "no"
fi

echo "Entry again?"
read -p ">> " response
HOME=$(pwd)
FILE=$HOME/file2.sh
if [ $response = "yes" ]; then              # distinto !=
    echo "yes..."
    bash $FILE
elif [ $response = "y" ]; then
    echo $(clear)
    echo "yes..."
    bash $FILE
else
    echo "goodbye"
fi
