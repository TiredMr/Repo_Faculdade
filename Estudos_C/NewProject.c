#include <stdio.h>
#include <locale.h>


int nota1, nota2, media;

int main(){
    setlocale(LC_ALL, "Portuguese");

    printf("Qual a primeira nota?\n");
    scanf("%d", &nota1);
    printf("Qual a segunda nota?\n");
    scanf("%d", &nota2);

    media = (nota1 + nota2) / 2;

    if(media >= 7){
        printf("Aprovado");
    }else if (media < 7 && media >= 4)
    {
        printf("Recuperação");
    }else if (media < 4)
    {
        printf("Reprovado");
    }
    
    return 0;
}
