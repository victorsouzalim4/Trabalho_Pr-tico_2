#include <stdio.h>
#include <string.h>
#include <stdbool.h>

typedef struct{
    char day[100];
    char month[100];
    char year[100];

} DateTime;

typedef struct{

} Lista;

typedef struct{

    char id[100];
    char name[100];
    Lista alternate_names;
    char house[100];
    char ancestry[100];
    char species[100];
    char patronus[100];
    bool hogwartsStaff;
    bool hogwartsStudent;
    char actorName[100];
    bool alive;
    DateTime dateOfBirth;
    int yearOfBirth;
    char  eyeColour[100];
    char  gender[100];
    char  hairColour[100];
    bool wizard;

}Personagem;

int main(){

    FILE *arq = fopen("C:/Users/Victor/Documents/FACULDADE/2 semestre/Aeds 2/TP_2/characters.csv", "r");

    char linha[100];


    if(arq == NULL){
        printf("Erro na abertura do arquivo");
        return 1;
    }

    fgets(linha, 100, arq);
    while(fgets(linha, 100, arq) != NULL){
        printf("%s", linha);
    }

}