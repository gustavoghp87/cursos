import pandas

serie = pandas.Series( ['p', 'y', 't', 'h', 'o', 'n'] )
print(serie)

#############################################################################

lst = ['p', 'y', 't', 'h', 'o', 'n']
df = pandas.DataFrame(lst)
print('\n', df)

#############################################################################

data = {
    'name': ['john', 'charles', 'peter'],
    'age': [34, 54, 24],
    'email': ['j@j.com', 'c@c.com', 'p@p.com']
}
df2 = pandas.DataFrame(data)
print(df2)
print('\n', df2[['name']])

#############################################################################

data2 = pandas.read_csv('file.csv', sep="[,]", engine='python')
data2.head(5)  # limit
print(f"\n{data2}")

bandas = data2.bandas
print(f"\n{bandas}")

unabanda = data2.iloc[2]
print(f"\n///////////////// imprime una fila \n{unabanda}\n{unabanda.shape}")

print("\n", data2.describe())

print("\n", data2.sort_index(axis=0, ascending=False))
