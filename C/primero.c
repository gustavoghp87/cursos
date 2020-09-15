#include <stdio.h>
#define numConst 7

void main()
{
    printf("Hola mundo");

    int numVar = 10;
    int resultado = numConst + numVar;
    printf("El resultado es: %d\n", resultado);

    int a, b, x, y, z;
    float e;
    x = 15 + 20/4;
    y = 13 - 2;
    z = x + y;
    a = x>y;    // responde 0 o 1
    b = x<y;
    e = 1.123456789;
    
    printf("El resultado 1 es: %d\n", x);
    printf("El resultado 2 es: %d\n", y);
    printf("El resultado 3 es: %d\n", z);
    printf("El resultado 4 es: %d\n", a);
    printf("El resultado 5 es: %d\n", b);
    printf("El resultado 6 es: %f\n", e);

    char c;

    printf("Ingrese tecla: ");
    scanf("%c", &c);
    printf("La tecla ingresada es: %c\n ", c);
}