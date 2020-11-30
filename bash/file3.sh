for counter in 1 2 3 4; do
    echo $counter
done

echo "Choose an option:
    1) first;
    2) second;
    0) cancel
"

select opc in 1 2 0; do

    case $opc in                   # until es el opuesto a while
        1)
            echo "You chose 1" ;;
        2)
            echo "You chose 2" ;;
        0)
            exit
    esac

done