#!/bin/bash

UNO=`ls`     # alt izq + 96
DOS=$(ls)    # se puede anidar
TRES=$(ls $(ls /))

echo $UNO
echo $DOS


LISTADO=$(ls $(cat directorios.txt))

UNO=`pwd`
DOS=$(ls $UNO)

UNO="/"
DOS=$(ls $UNO)

echo $UNO
echo $DOS
