#!/bin/bash
VAR="hola mundo"   #[variable global]

f_hola(){
 VAR="variable local"
 echo $VAR
}

echo $VAR
f_hola          #[ejecuta la función]
