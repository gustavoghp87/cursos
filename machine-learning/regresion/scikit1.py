import pandas as pd
import matplotlib.pyplot as plt
#from sklearn import tree
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression

dataset = pd.read_csv('salarios.csv', sep="[,]", engine='python')
print(dataset)

x = dataset.iloc[:, :-1].values
y = dataset.iloc[:, 1].values

print("\nX:", x, "\nY:", y)


X_train, X_test, Y_train, Y_test = train_test_split(x, y, test_size=0.2, random_state=0)

print("\nX_train", X_train)
print("\nY_train", Y_train)
print("\nX_test", X_test)
print("\nY_test", Y_test)

regressor = LinearRegression()
regressor.fit(X_train, Y_train)

viz_train = plt
viz_train.scatter(X_train, Y_train, color='blue')
viz_train.plot(X_train, regressor.predict(X_train), color='black')
viz_train.title('Salarios vs. Experiencia')
viz_train.xlabel('Experiencia')
viz_train.ylabel('Salarios')
print("\nREGRESIÓN TRAIN\n", regressor.score(X_train, Y_train))
viz_train.show()

###################################################################################

viz_test = plt
viz_test.scatter(X_test, Y_test, color='red')
viz_test.plot(X_train, regressor.predict(X_train), color='black')
viz_test.title('Salarios vs. Experiencia')
viz_test.xlabel('Experiencia')
viz_test.ylabel('Salarios')
print("\nREGRESIÓN TEST\n", regressor.score(X_train, Y_train))
viz_test.show()

