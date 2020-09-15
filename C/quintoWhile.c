#include <stdio.h>

void main()
{
    int decision = 1;
    int inc = 0;

    while(decision==1)
    {
        inc++;
        printf("Ejecucion #%d\n", inc);
        printf("Si desea continuar, presione 1; cualquier otra tecla para salir");
        scanf("%d", &decision);
    }
    printf("Has salido");
}