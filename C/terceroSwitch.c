#include <stdio.h>

void main()
{
    int x;
    printf("Introduzca valor x entero entre 0 y 3: ");
    scanf("%d", &x);

    switch(x)
    {
        case 0:
        printf("Cumplido caso 0\n");
        break;

        case 1:
        printf("Cumplido caso 1\n");
        break;

        case 2:
        printf("Cumplido caso 2\n");
        break;

        case 3:
        printf("Cumplido caso 3\n");
        break;
    }
}