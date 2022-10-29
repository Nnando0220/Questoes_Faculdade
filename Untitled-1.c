#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");
    
    int A[5], n, i, cont=0;

    for (i = 0; i < 5; i++)
    {
        printf("\nDigite 3 números:");
        scanf("%d", &A[i]);     
    }

    printf("\n\nDigite um número:");
    scanf("%d", &n);

    for (i = 0; i < 5; i++)
    {
        if(A[i]==n)
        {
            cont++;
        }
    }

    printf("\nNúmero %d foi digitado %d", n, cont, " vez(es)");

    return 0;
}
