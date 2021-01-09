# Recordar:   sudo apt install python3-pip
# python -m pip install -U pip

# VIRTUALENV
# pip install virtualenv       virtualenv venv   (para crear)              "venv" siempre es un nombre personalizado
# Windows:   venv\Scripts\activate       venv\Scripts\deactivate
# Linux:     source venv/bin/activate    deactivate
# requirements:  Django==3.0.6  etc
# virtualenv venv --python=python3           
# pip freeze    imprime las librerías instaladas en el venv, también       pip list
# pip freeze > requirements       imprime en archivo (.txt para muchos)             pip install -r requirements

# django trae su servidor de prueba:   python index.py runserver 0.0.0.0:8080
# npm install --global --production windows-build-tools node-gyp


# ANACONDA
# permite elegir la versión de python
# conda es el administrador de paquetes de anaconda y entorno virtual
# conda create --name proyecto1 python=3.7
# conda activate proyecto1     conda deactivate   no hace falta salir para cambiar a otro
# conda env list   listar los entornos
# conda install numpy pip           trae del repositorio de anaconda; si no está el que se busca:
# conda config --show channels
# conda install --channel conda-forge [librería que no está en el repo de anaconda]          ver conda-forge.org
# conda config --add channels conda-forge     conda config --show channels
# conda config --get channels   da las prioridades de repositorias
# conda config --remove channels conda-forge
# conda env remove -n proyecto1
# tensorflow: python3.7


#################################################################################################################################

import sys

for arg in sys.argv:
    print(arg)

print(f"Argument from my_script: {sys.argv[1]}")



x = 5
y = 7

suma = x + y
potencia = x ** y

print (suma)
print("Potencia: ")
print (potencia)

#name = input('Enter the name: ')
#print(name)

print(type(suma))
suma = "48"
print(type(suma))
suma = float(suma)
print(type(suma))
suma = str(suma)
print(type(suma))
suma = 20

#print("suma:", suma, ", potencia:",potencia)

#num = input("Enter a number: ")
#num = int(num)
#print("Elegido el número", num)

if suma > 10:
    print('Bigger')            #  bigger than Vs. greater than
    if suma > 19:
        print('So bigger')     # smaller than Vs. less than
elif suma > 6:
    print('It is smaller but > 6')
else:
    print('Small')

suma = "casa"
try:
    converse = int(suma)
    print(suma)
except:
    suma = 58
    print("No se puede convertir en integer")


def imprimir():
    print("Imprimiendo desde función ('def')")

imprimir()

#while True:
#    line = input('Escriba algo, done para salir>')
#    if line == "done":
#        break
##    print(line)
#print("Done!")             # Loop del que solo se sale escribiendo done

#while True:
#    line = input('Escriba algo, done para salir>')
#    if line[0] == "#":
#        continue
#    if line == "done":
#        break
#    print(line)
#print("Done!")             # Si lo escrito comienza con # (posición cero) se interrumpe el ciclo y vuelve a comenzar

for i in [5, 4, 3, 2, 1]:
    print(i)
print('finished')

arrayCarlos = ["John4", 33]
friends = ["john", 9999, "john3", arrayCarlos]
for friends in friends:
    print('Hello,', friends)

smallest = None
for value in [9, 41, 5, 22, 34]:
    if smallest is None:
        smallest = value
    elif value < smallest:
        smallest = value
    print (smallest, value)
print("The smallest:", smallest)

fruit = "banana"
letter = fruit[2]
print("Tercera letra de la fruta:", letter)
lenght_banana = len(fruit)
print("Longitud del String:", lenght_banana)

index = 0
while index < len(fruit):
    letter = fruit[index]
    print(index, letter)
    index = index + 1

for letter in fruit:
    print (letter)

s = "Monty Python 1234"
print(s[0:4])              #El segundo es no incluyente
print(s[2:8])

if fruit < "bananaa":      #orden alfabético
    print("Viene antes en el orden alfabético")

print("BanaNa".lower())       #Pasa todo a minúsculas
print("BanaNa".upper())       #Pasa todo a mayúsculas

hello = "Hello Jack?!#-"
print(hello.replace("Jack", "Bob"))
print(hello.replace("o", "X"))

hello = " Hello Jack "        #strip remueve los espacios en blanco a principio y final del String (también los signos)
print(hello.strip())            #lstrip izquierda, rstrip derecha

print(hello.startswith(" Hell"))     #Booleano empieza exactamente con

phrase = "Email: g@hotmail.com Gustavo H P codigo postal 1"
atpos = phrase.find("@")             #find asigna un número de posición al caracter buscado
print(atpos)
sppos = phrase.find(" ")             #primer espacio en blanco
print(sppos)
sppos = phrase.find(" ", atpos)      #primer espacio en blanco partiendo desde el arroba
print(sppos)

part = phrase[atpos-1 : sppos]
print(part, "------------------------------")

#LECTURA DE ARCHIVOS EXTERNOS
xfile = open("C:\\Users\ghp21\Downloads\Repository\PROGRAMMING\Python3 Dr. Chuck/Notas del video.txt")      #w significa write, w+ es write and read, r es read, a es append es añadir/adjuntar
count = 0
for line in xfile:
    line = line.rstrip()                #quita el salto de línea invisible al final de la línea de texto
    if line.startswith("Aut"):
        print(line)
    count = count + 1
print("Line count:", count)

xfile = ""
xfile = open("C:\\Users\ghp21\Downloads\Repository\PROGRAMMING\Python3 Dr. Chuck/Notas del video.txt")          #w significa write, w+ es write and read, r es read, a es append es añadir/adjuntar
inp = xfile.read()              #todo el texto en un String
print(len(inp))                 #contar los caracteres del String
print(inp[9:35])                #quit() saca del programa en donde esté, importante en los try/except


friends = ["smith1", "smith2", "smith3", "smith4"]
print(friends[2])
friends[2] = "smith333"
print(friends[2])
print(len(friends))             # len = lenght

z = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
print(range(4))
print(range(len(z)))

y = [10, 11, 12]
print(z+y)

print(friends[1:3])       #desde el 1 inclusive hasta el 3 no inclusive
print(friends[1:])        #desde el 1 inclusive
print(friends[:2])        #hasta el 2 sin incluir
print(friends[:])         #todos

#-------------------------------------------------------------------------------
# LISTAS #   son como las lays

g = list()                # se puede crear vacía e ir agregando con append
print(type(g))            # se agregan al final
print("MÉTODOS ADMITIDOS PARA LISTAS:", dir(g))

g.append("primerElemento")
g.append(2)
g.append("tercero")
print(g)

nums = [54, 44, 9, 74, 1, 100, 12, 74, 1]
print(len(nums))
print(max(nums))
print(min(nums))
print(sum(nums))
print(sum(nums)/len(nums))

#numList = list()
#while True:
#    inp = input("Enter a number or type done: ")
#    if inp == "done" : break
#    value = float(inp)
#    numList.append(value)
#print(sum(numList)/len(numList))

abc = "with three words"
separadas = abc.split()
print(separadas)              # el String se convierte en una lista
ABC = "with; three; words"
SEPARADAS = ABC.split("; ")    # se le indica el separador elegido (nada es space por default)
print("imprimir", SEPARADAS)

for w in separadas:           # w resume word y es una variable reservada
    print(w)

# Se puede hacer if ( condicion1 or condicion2) para evitar anidar if porque python leer primero el primero
#  y solo lee el segundo si el primero se cumplió

diccionario = dict()
diccionario["money"] = 12     # 12 es el elemento y money su etiqueta, es un diccionario de números
diccionario["candy"] = 3      # es como una lista donde la key no es un número ordenado sino una palabra
diccionario["tissues"] = 75
print(diccionario)

diccionario["money"] = diccionario["money"] + 100
print(diccionario)

diccionario2 = {}
diccionario3 = { "money2": 1 , "candy2": 42, "tissues2": 100}
print(diccionario)
print('money2' in diccionario2)
print("money2" in diccionario3)          # consulta si una key (etiqueta) está en el diccionario

counts = dict()
counts["john2"] = 45
names = ["john3", "john1", "john2", "john2", "john1", "john2", "john1", "john2", "john2", "john3", "john3", "john1", "john1"]  #lista
for name in names:
    if name not in counts:
        counts[name] = 1
    else:
        counts[name] = counts[name] + 1
print(counts)

# SE AUTOMATIZA CON get()
if name in counts:
    x = counts[name]
else:
    x = 0    
x = counts.get(name, 0)             # get = le asigna el valor para name, o 0 si no hay
print(x)

for name in names:
    counts[name] = counts.get(name, 0) + 1
print(counts)

# CONTAR PALABRAS EN UN TEXTO
#counts = dict()
#print("Ingresa el texto completo: ")
#line = input("")
#words = line.split()                  #separa todas las palabras y crea una lista
#print("Palabras:", words)
#print("contando...")
#for word in words:
#    counts[word] = counts.get(word, 0) + 1   # mete la lista en el diccionario y suma 1 a cada palabra cada vez que aparece
#print("Contados:", counts)                   # get: que devuelva 0 si no está, y su valor si está

jjj = { "tom5": 23, "tom4": 3, "tom1": 13, "tom8": 4, "tom6": 0, "tom7": 102, "tom2": 4, "tom3": 27}
print(list(jjj))
print(jjj.keys())
print(jjj.values())
print(jjj.items())

for aaa,bbb in jjj.items():
    print(aaa, bbb)

print("######### STOP #########\n")
largest = -1
theWord = None
for k,v in jjj.items():                 # key, value
    print(k,v)
    if v > largest:
        largest = v
        theWord = k
print("The largest is", k, "with", largest)

###########################################

l = list()
print("MÉTODOS ASOCIADOS A LOS DICCIONARIOS:", dir(l))

#######################################################################################
#######################################################################################


##### TUPLES #####

x = ("donald1", "donald2", 'donald3', 'donald4')
print(x[2])

y = (3, 1, 5, 3, 7, 8, 0)
print(y)
print("Máximo en y:", max(y))

for iter in y:
    print(iter)

# NO SE PUEDE REASIGNAR LOS ELEMENTOS Y POR ESO SON EFICIENTES Y AMADOS

t = tuple()
print("MÉTODOS ASOCIADOS A LOS TUPLES:", dir(t))

(x, y) = ("abscisas", 51)
print(y)

# el método items() em diccionarios devuelve una list de llave-valor

if (0, 1, 2) < (0, 1, 3):
    print(True)
if ("tom", "johnA", "Z") < ("tom", "johnB", "A"):
    print(True)

# se puede invertir el orden key-value: 

# forma larga:
c = {"a": 10, "b": 1, "c": 22}
tmp = list()
for k,v in c.items():
    tmp.append((v,k))              #invertidos k y v
print(tmp)
tmp = sorted(tmp, reverse=True)    #sorted ordena de menor a mayor por "key" (ex value), y reverse invierte también el orden
print(tmp)

# forma corta:
print(sorted([(v,k) for k,v in c.items()]))


#########################################################################################################
########### REGULAR EXPRESSIONS ############

hand = open('C://Users/ghp21/Downloads/Repository/PROGRAMMING/Python3 Dr. Chuck/file.txt')
for line in hand:
    line = line.rstrip()
    if line.find("dom") >= 0:
        print(line)

### pero usando regex
import re
hand = open('C://Users/ghp21/Downloads/Repository/PROGRAMMING/Python3 Dr. Chuck/file.txt')
for line in hand:
    line = line.rstrip()
    if re.search("d.m", line):
        print(line, "punto es comodin, asterisco es cantidad indeterminada")

print("Empieza con  1::")

hand = open('C://Users/ghp21/Downloads/Repository/PROGRAMMING/Python3 Dr. Chuck/file.txt')
for line in hand:
    line = line.rstrip()
    if line.startswith(" 31:"):
        print(line)

### pero usando regex
import re
hand = open('C://Users/ghp21/Downloads/Repository/PROGRAMMING/Python3 Dr. Chuck/file.txt')
for line in hand:
    line = line.rstrip()
    if re.search("^ 31:", line):
        print(line)

import re
x = "My 2 favorite numbers are 19 and 42"
y = re.findall('[0-9]+', x)                         # [0-9] one or more digits
print(y)
x = "My 2 favorite nUmbers Are 19 and 42"
z = re.findall('[AEIOU]+', x)
print(z)
x = "From: Using the : character ... blablabla ... unForgiven: next"
y = re.findall('^F.+:', x)                         # Desde la primera F hasta el último dos puntos
print(y)                                           # el punto es one or more times

x = "Marta marta@hotmail.com My 2 favorite numbers are 19 and 42"
y = re.findall('\S+@\S+', x)                       # entre espacios
print(y)

atpos = x.find("@")                   # toma el número de la posición del @
sppos = x.find(" ", atpos)            # toma el número del primer espacio que le sigue
print(x[atpos+1 : sppos])

words = x.split()
email = words[1]
pieces = email.split("@")
print(pieces)

y = re.findall("@([^ ]*)", x)
print(y)

w = "We have lost $1000 in the begging"
t = re.findall("\$[0-9.]+", w)
print(t)

print("############################################################################")

print(ord('a'), ord('1'), ord('ñ'), ord('%'), ord('^'), ord('@'), ord('|'), ord('\n'))

g = b"Pasar de String a bytes"
print("Tipo de variable g:", type(g))

# Python 2 pasaba String a Unicode antecediendo el String con u


#######################################################################################

# ejercicio de
import socket

mysock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
mysock.connect(('data.pr4e.org', 80))

cmd = 'GET http://data.pr4e.org/romeo.txt HTTP/1.0\r\n\r\n'.encode()

mysock.send(cmd)                  # envío bytes
# trae el código fuente y lo pasa a Unicode (alternativa: b"GET http...")

i = 0
while True:
    i+=1
    data = mysock.recv(100)       # recibo bytes,   recv(100) corta cada 100 caracteres
    if len(data) < 1:
        break
    print("\n", i, "\n", data.decode())          # traduzco bytes e imprimo

mysock.close()


#######################################################################################
#######################################################################################

import urllib.request

Romeo = urllib.request.urlopen('http://data.pr4e.org/romeo.txt')
# trae el código html pero codificado en bytes

# print(type(Romeo))

for line in Romeo:
    print(line.decode().strip())             # strip() 

print("\n--------------------------------------------------------------------------\n")

#######################################################################################
#######################################################################################


import urllib.request, urllib.parse, urllib.error

Page1 = urllib.request.urlopen('http://www.dr-chuck.com/page1.htm')

for line in Page1:
    print(line.decode().strip())

#######################################################################################
############ BEAUTIFUL SOUP LIBRARY ###############

# Example from wikipedia:
from bs4 import BeautifulSoup
# pip3 install lxml
# pip3 install html5lib

with open("./index.html", encoding='utf8') as file:
    soup = BeautifulSoup(file, "lxml")
#with evita el try/finally y el .close()
 
for anchor in soup.find_all('a'):
    print("\n", anchor.get('href', '/'))
#ubica todas las etiquetas <a> del archivo y les hace un tratamiento individual, imprimiendo los destinos

#######################################################################################


import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup

url = input("\n\nEnter - ")
site = urllib.request.urlopen(url).read()
soup = BeautifulSoup(site, 'html.parser')

tags = soup('a')
for tag in tags:
    print("\nTag...", tag.get('href', None), "\n")


print("################################################################################\n\n")

# Lo mismo pero esquivando posibles problemas de certificado ssl:

import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl

#ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

url = input("Enter - ")
html = urllib.request.urlopen(url, context=ctx).read()
soup = BeautifulSoup(html, 'html.parser')

tags = soup('a')
for tag in tags:
    print(tag.get('href', None), "\n")

