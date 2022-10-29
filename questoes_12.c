#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

float soma(int n1, int n2){

    int cont=0, i;

    while (n1 <= n2)
    {
        n1++;
        if (n1 % 2 == 0)
        {
            cont++;
        } 
    }
    
    return cont;
}

int main()
{
    int num1, num2, total;

    do
    {
        printf("\nDIGITE UM NÚMERO:");
        scanf("%d", &num1);

        printf("\nDIGITE UM NÚMERO:");
        scanf("%d", &num2);   

    } while (num1>num2);

    total = soma(num1, num2);

    printf("\nO TOTAL DOS NÚMEROS %d ATÉ %d = %d", num1, num2, total);

    return 0;
}
