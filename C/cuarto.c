#include <stdio.h>
#include <string.h>

void main()
{
    char userName[25];
    int decision;
    
    printf("Bienvenidos a Platzi Terminal \n");
    printf("Ingresa tu nombre: ");
    scanf("%s", userName);
    printf("Bienvenido %s, procedemos...\n", userName);

    if(strcmp(userName, "ghp21")==0)
    {
        printf("Ingreso version gratuita. Que hacer?\n");
        printf("Ingrese 1 para estudiar,\n2 para leer el blog\nCualquier otro valor para salir\n");
        scanf("%d", &decision);

        if(decision==1)
            printf("Estas en la seccion de estudio\n");
        else if(decision==2)
            printf("Estas en el blog");
        else
            printf("Adios");
    }
    else if(strcmp(userName, "ghc87")==0)
    {
        printf("Ingreso version STANDARD. Que hacer?\n");
        printf("Ingrese 1 para estudiar,\n2 para leer el blog\nCualquier otro valor para salir\n");
        scanf("%d", &decision);

        if(decision==1)
            printf("Estas en la seccion de estudio\n");
        else if(decision==2)
            printf("Estas en el blog");
        else
            printf("Adios");
    }
    else if(strcmp(userName, "ghp")==0)
    {
        printf("Ingreso version PREMIUM. Que hacer?\n");
        printf("Ingrese 1 para estudiar,\n2 para leer el blog\nCualquier otro valor para salir\n");
        scanf("%d", &decision);

        if(decision==1)
            printf("Estas en la seccion de estudio\n");
        else if(decision==2)
            printf("Estas en el blog");
        else
            printf("Adios");
    }
    else
    {
        printf("Registrate primero");
    }
    
}