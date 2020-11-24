echo
echo "hasta la vista"
sleep 3
echo "baby"
echo "you are at $(pwd)"
echo

read -s -p "enter your password: " password1     # -s hace que no se vea (poner al frente)
echo "passwords: $password1"                     # -p almacena la respuesta en la variable del final
echo
echo "choose an option: 1, 2 or 3: "
read opc
echo "you choose $opc"
