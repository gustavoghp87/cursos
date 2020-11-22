import numpy as np

a = np.array([1,2])
b = np.array([3,4])
print(a*b, "\n")
print(b[1], "\n")

print(np.arange(10), "\n")                    # como range(0,10)
print(np.zeros((2,4)), "\n")                  # matriz de 2x4 de ceros
print(np.ones(5), "\n")                       # linespace   a5   shape
print(np.identity(4), "\n")                   # matriz cuadrada de 0 y con 1 en la diagonal
#display("a123")                # imprime

#   ver matlab        plotting: matplotlib

# atributo ndim es la cantidad de filas    atributo shape es filas x columnas
# itemsize  nbytes  

# c = np.array([1,2], dtype='int16')
# print(c.dtype)

d = np.array([ [1,2,3,4], [5,6,7,8], [9,10,11,12] ])
print(d[1,1])
print(d[1, :])     # fila 2
print(d[:, 1], "\n")     # columna 2
# seleccionar un elemento:   matriz[fila, columna]   admite negativos para contar desde el último

print(d[0, 0:3 ])       # fila 0, columnas 0 a 3
print(d[0, 0:3:1], "\n")       # fila 0, columnas 0 a 3 yendo de 1 en 1

d[0,0] = 99
d[2, :] = [9, 9, 9, 9]
print(d, "\n")

d3 = np.array([ [[1,2],[3,4]], [[5,6]] ])
print(d3, "\n")

e = np.full((3,4), 8)
print(e, "\n")

f = np.full_like(d, 7)       # toma las dimensiones de d
print(f, "\n")

g = np.random.rand(4,5)                 # random entre 0 y 1
g = np.random.random_sample(d.shape)    # random entre 0 y 1
print(g, "\n")

h = np.random.randint(10, size=(5,5))         # 10 es el máximo, ningún size es 1x1
print(h, "\n")

# seguir en el min 30 https://www.youtube.com/watch?v=QUT1VHiLmmI

