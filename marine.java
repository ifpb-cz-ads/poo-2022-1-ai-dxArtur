import java.util.Scanner;

class Pirate{
    String name;
    String nick;
    String akumanomi;
    String ocupation;
    Tripulation tripulation;
    boolean status;
    int reward;
}

class Tripulation{
    String name;
    String Captain;
    Pirates members[];
    String jobs[];
}

public class marine{

    static void addPirate(){
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter a full pirate name: ");  
        String fullname= sc.nextLine();
    }

    static void showPirate(){
        System.out.println("Your full name is:");
        System.out.println("know as:");
        System.out.println("Your reward is:");
        System.out.println("===== more informations =====");
        System.out.print(".");
        
    }
    
    static void capturePirate(){
        System.out.println("The Notorius pirate");
    }

    public static void main(String[] args){
        //Create my first object

        Pirate luffy = new Pirate();

        luffy.name = "Monkey D. Luffy";
        luffy.nick = "Mugiwara no Luffy";
        luffy.akumanomi = "Hito Hito no mi model God Sun";
        luffy.ocupation = "Captain";
        luffy.reward = 1500000000;

        Pirate sanji = new Pirate();

        sanji.name = "Vinsmoke Sanji";
        sanji.nick = "Black Leg Sanji";
        sanji.akumanomi = "no have";
        sanji.ocupation = "Cooker";
        sanji.reward = 330000000;


        capturePirate();

    }
}
