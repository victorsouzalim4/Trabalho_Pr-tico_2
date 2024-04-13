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
    char linha[1000];
    char atributos[18][1000];
    char apelidos[10][100];


    if(arq == NULL){
        printf("Erro na abertura do arquivo");
        return 1;
    }

    fgets(linha, 1000, arq);
    fgets(linha, 1000, arq);
    /*while(fgets(linha, 300, arq) != NULL){
        printf("%s", linha);
    }*/

    for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 1000; j++) {
            atributos[i][j] = '\0';
        }
    }
    int pos = 0;
    for(int i = 0; i < 18; i++){
        for(int j = pos, k = 0; j < 1000; j++, k++){
            if(linha[j] != ';' && linha[j] != '\0' && linha[j] != '\n'){
                atributos[i][k] = linha[j];
            }
            else{
                pos = j+1;
                j = 1000;
            }
            //printf("%c", atributos[i][k]);
        }  
        //printf("\n");  
    }


    for(int i = 0; i < 10; i++){
        for(int j = 0; j < 100; j++){
            apelidos[i][j] = '\0';
        }
    }
    pos = 0;
    for(int i = 0; i < 10; i++){
        int cont = 0;
        for(int j = pos, k = 0; j < 100; j++, k++){
            if(atributos[2][j] == '\''){
                cont++;
                j++;
            }
            if(cont == 1){
                apelidos[i][k] = atributos[2][j];
            }
            else if(cont == 2){
                pos = j+1;
                j = 100; 
            }
                printf("%c", apelidos[i][k]);  
        }
        printf("\n");
    }
}