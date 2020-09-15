#include <stdio.h>

int search (int vector_entrada[], int n, int x)
{
    int i;
    for (i=0; i<n; i++)
        if (vector_entrada[i] == x)
            return i;
    return -1;
}

void main()
{
    int pos;
    int n = 10;
    int vector_entrada[] = {10,11,250,13,14,100,16,99,100,120};
    pos = search(vector_entrada, n, 100);
    printf("%d", pos+1);
}