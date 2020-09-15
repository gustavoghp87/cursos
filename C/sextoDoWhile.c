#include <stdio.h>

void main()
{
    int decision;
    int inc = 0;

    do
    {
        inc++;
        printf("Ejecucion #%d\n", inc);
        printf("Si desea continuar, presione 1; cualquier otra tecla para salir");
        scanf("%d", &decision);
    } while(decision==1);
    printf("Has salido");
}