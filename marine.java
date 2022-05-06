import java.util.Scanner;

class peaple{
    String name;
    String akumanomi;
    String haki;
    String 
}
// as classes Pirate e Sailor são classes abastratas de pessoas 

class Pirate{
    String name;
    String nick;
    String akumanomi;
    String ocupation;
    String tripulation;
    boolean status;
    int reward;
}

class Tripulation{
    String name;
    String Captain;
    String members[];
    String jobs[];
    String ship;
}

class Akumanomi{
    String name;
    String type;
}

public class marine{

    static void addPirate(){
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter a full pirate name: ");  
        String fullname= sc.nextLine();
    }

    static void moveTripulation(){
        System.out.print("Now, the pirate of the tripulation is a ocupation on the board tripulation");
    }

    static void showPirate(){
        System.out.println("Your full name is:");
        System.out.println("know as:");
        System.out.println("Your reward is:");
        System.out.println("===== more informations =====");
        System.out.print(Tripulation.name);
        
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
        // como definir o objeto de uma classe, sendo o atributo de outra
        luffy.tripulation = mugiwara.Tripulation.name;

        System.out.print(luffy.tripulation);

        Pirate sanji = new Pirate();

        sanji.name = "Vinsmoke Sanji";
        sanji.nick = "Black Leg Sanji";
        sanji.akumanomi = "no have";
        sanji.ocupation = "Cooker";
        sanji.reward = 330000000;


        Tripulation mugiwara = new Tripulation();

        mugiwara.name = "Mugiwara Pirates";
        mugiwara.ship = "Thousand Sunny";

        // como passar uma instancia como o parametro
        showPirate(luffy);
        capturePirate();


        

    }
}
