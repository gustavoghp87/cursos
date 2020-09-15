#include <stdio.h>
#define k 9
#define m 2
float x;
float aux;
float f;

void main()
{
    printf("Introduzca el valor de x: ");
    scanf("%f", &x);
    aux = k * (x-m) * (x-m);
    f = aux/(1+aux);
    printf("El resultado es: %f\n", f);

    int a;
    printf("Diga el valor de a: ");
    scanf("%d", &a);
    int b = 9;
    if(a>b)
    {
        printf("Efectivamente, a es mayor que b\n");
    }

    if (a == 0)
        printf("a es un numero igual a 0\n");
    else if(a<0)
        printf("a es menor a 0\n");
    else
        printf("a es mayor a 0\n");
    printf("El programa acaba de cerrarse.\n");

}



/*
    comentarios
    largos
    re
*/