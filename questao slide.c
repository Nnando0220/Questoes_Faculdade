#include <stdio.h>
#include <stdlib.h>
#define quant 3

void vetor()
{
    int i, menor=0;
    
    int vet[quant];
    
    for (i = 0; i < quant; i++)
    {
        printf("DIGIETE OS NUMEROS DO VETOR: ");
        scanf("%d", &vet[i]);
    }
    
    menor=vet[0];

    for (i = 0; i < quant; i++)
    {
        if (menor > vet[i])
        {
            menor=vet[i];
        }    
        
    }

    int sum=0; 

    for (int i = 0; i < quant; i++)
    {
        if (vet[i]%menor==0)
        {
            sum++;
        } 
    }

    printf("\nO MENOR NUMERO DIGITADO: %d", menor);
    printf("\nQUANTIDADE DE NÚMEROS DIVISIVEIS PELO MENOR: %d", sum);

}

int main()
{

    vetor();

    return 0;
}
