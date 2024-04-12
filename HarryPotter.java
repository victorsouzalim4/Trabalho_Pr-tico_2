import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class DateTime {
    private String day;
    private String month;
    private String year;

    DateTime(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void mostra() {
        System.out.print(day + "/" + month + "/" + year + " ");
    }

}

/*
 * class Lista{
 * private String codenames[];
 * 
 * Lista(String frase){
 * 
 * int qtd = 0;
 * while(temNomes(frase)){
 * qtd++;
 * }
 * codenames = new String[qtd];
 * 
 * for(int i = 0; i < qtd; i++){
 * codenames[i] = pegaApelido(frase);
 * }
 * }
 * 
 * public String[] getCodenames() {
 * return codenames;
 * }
 * public void setCodenames(String[] codenames) {
 * this.codenames = codenames;
 * }
 * 
 * public void mostra(){
 * for(int i = 0; i < codenames.length; i++){
 * System.out.print(codenames[i] + " ");
 * }
 * }
 * }
 */

class Personagem {
    private String id;
    private String name;
    // private Lista alternate_names;
    private String house;
    private String ancestry;
    private String species;
    private String patronus;
    private Boolean hogwartsStaff;
    private String hogwartsStudent;
    private String actorName;
    private Boolean alive;
    private DateTime dateOfBirth;
    private int yearOfBirth;
    private String eyeColour;
    private String gender;
    private String hairColour;
    private Boolean wizard;

    public Personagem(String id, String name /* Lista alternate_names */, String house, String ancestry, String species,
            String patronus, Boolean hogwartsStaff, String hogwartsStudent, String actorName, Boolean alive,
            DateTime dateOfBirth, int yearOfBirth, String eyeColour, String gender, String hairColour, Boolean wizard) {
        this.id = id;
        this.name = name;
        // this.alternate_names = alternate_names;
        this.house = house;
        this.ancestry = ancestry;
        this.species = species;
        this.patronus = patronus;
        this.hogwartsStaff = hogwartsStaff;
        this.hogwartsStudent = hogwartsStudent;
        this.actorName = actorName;
        this.alive = alive;
        this.dateOfBirth = dateOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.eyeColour = eyeColour;
        this.gender = gender;
        this.hairColour = hairColour;
        this.wizard = wizard;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
     * public Lista getAlternate_names() {
     * return alternate_names;
     * }
     * public void setAlternate_names(Lista alternate_names) {
     * this.alternate_names = alternate_names;
     * }
     */
    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getAncestry() {
        return ancestry;
    }

    public void setAncestry(String ancestry) {
        this.ancestry = ancestry;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getPatronus() {
        return patronus;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    public Boolean getHogwartsStaff() {
        return hogwartsStaff;
    }

    public void setHogwartsStaff(Boolean hogwartsStaff) {
        this.hogwartsStaff = hogwartsStaff;
    }

    public String getHogwartsStudent() {
        return hogwartsStudent;
    }

    public void setHogwartsStudent(String hogwartsStudent) {
        this.hogwartsStudent = hogwartsStudent;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

    public Boolean getWizard() {
        return wizard;
    }

    public void setWizard(Boolean wizard) {
        this.wizard = wizard;
    }

    public void imprime(String Id) {

        System.out.print(id + "\n" + name);
        // alternate_names.mostra();
        System.out.print(house + " " + ancestry + " " + species + " " + " " + patronus + " ");
        System.out.print(hogwartsStaff);
        System.out.print(hogwartsStudent + " " + actorName + " ");
        System.out.print(alive);
        dateOfBirth.mostra();
        System.out.print(yearOfBirth);
        System.out.print(eyeColour + " " + gender + " " + hairColour + " ");
        System.out.print(wizard + " ");

    }

    public Personagem clone(Personagem personagem) {
        return personagem;
    }
}




public class HarryPotter {              //este método separa os atributos do objeto que estão contidos em uma string e os guarda separadamente em um array

    public static String[] SeparaAtributos(String objeto) {
        String atributos[] = new String[18];
        int pos = 0;

        for (int i = 0; i < atributos.length; i++) {
            StringBuilder aux = new StringBuilder();      

            for (int j = pos; j < objeto.length() && objeto.charAt(j) != ';'; j++ ) {
                aux.append(objeto.charAt(j));          
            }

            pos = pos + aux.length() + 1;

            String str = new String(aux);
            atributos[i] = str;

        }

        return atributos;
    }


    public static void main(String[] args) {

        try {
            File myObj = new File("characters.csv");
            Scanner Sc = new Scanner(myObj); Sc.nextLine();
            Personagem personagem[] = new Personagem[405];
            String atributos[] = new String[18];

            String objeto = Sc.nextLine();
            atributos = SeparaAtributos(objeto);

            for(int i = 0; i < atributos.length; i++){
                System.out.println(atributos[i]);
            }

            Sc.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("ERRO");
            e.printStackTrace();
        }

    }
}