#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

void flores();

void flores()
{
    int i;
    
    int flor[2][3];
    int unid[2];
    
    for (int i = 0; i < 2; i++)
    {

        printf("\n\nPLANTA: %d ",i+1);
        printf("\nDIGITE O CÓDIGO DA %d PLANTA: ", i+1);
        scanf("%d", &flor[i][0]);
        printf("\nDIGITE A QUANTIDADE IDEAL DE ESTOQUE DA %d PLANTA: ", i+1);
        scanf("%d", &flor[i][1]);
        printf("\nDIGITE A QUANTIDADE DE ESTOQUE DA %d PLANTA: ", i+1);
        scanf("%d", &flor[i][2]);
    }
    
    for (int i = 0; i < 2; i++)
    {
        printf("\n\nPLANTA: %d", i+1);
        printf("\nA %d PLANTA  DO CÓDIGO: %d", i+1, flor[i][0]);
        printf("\nA QUANTIDADE DE ESTOQUE IDEAL DA %d PLANTA: %d", i+1, flor[i][1]);
        printf("\nA QUANTIADE DE ESTOQUE DA %d PLANTA: %d", i+1, flor[i][2]);
        if (flor[i][2] < flor[i][1])
        {
            printf("\nESTOQUE DA %d PLANTA ESTÁ MENOR QUE A IDEAL!", i+1);
            unid[i] = flor[i][1] - flor[i][2];
            printf("\nSERÁ NECESSARIO COMPRAR %d UNIDADES DA %d PLANTA", unid[i], i+1);    
        }
    }

}
    

int main()
{
    flores();

    return 0;
}
