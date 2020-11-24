pwd=$(pwd)

while test true
do
    echo "hola"
    read
done

# ---------------------------------

until [ true ]       #al menos una reproducción
do
    echo "hola"
    read
done


# ---------------------------------

until false
do
    echo "hola"
    read
done


# ---------------------------------

for i in `ls`
do
    echo $i
done

# ---------------------------------

for (( i=0 ; i <= 10 ; i++ ))
do
    echo $i
done

