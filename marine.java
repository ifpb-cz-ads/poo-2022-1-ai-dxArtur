import java.util.Scanner;

class Peaple{
    String name;
    String akumanomi;
    String haki;
}
// as classes Pirate e Sailor são classes abastratas de pessoas 

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
    Pirate members[];
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

    static void showPirate(Pirate pirate){
        System.out.println("Your full name is:" + pirate.name);
        System.out.println("know as:" + pirate.nick);
        System.out.println("Your reward is:" + pirate.reward);
        System.out.println("===== more informations =====");
        System.out.println("Actually is: " + pirate.ocupation + "on board on: " + pirate.tripulation.ship);
        
    }
    
    static void capturePirate(Pirate pirate){
        System.out.println("The Notorius pirate");
    }

    public static void main(String[] args){
        //Create my first object
        
        Tripulation mugiwara = new Tripulation();

        mugiwara.name = "Mugiwara Pirates";
        mugiwara.ship = "Thousand Sunny";
        
        
        Pirate luffy = new Pirate();

        luffy.name = "Monkey D. Luffy";
        luffy.nick = "Mugiwara no Luffy";
        luffy.akumanomi = "Hito Hito no mi model God Sun";
        luffy.ocupation = "Captain";
        luffy.reward = 1500000000;
        luffy.tripulation = mugiwara;

        

        System.out.print("");

        Pirate sanji = new Pirate();

        sanji.name = "Vinsmoke Sanji";
        sanji.nick = "Black Leg Sanji";
        sanji.akumanomi = "no have";
        sanji.ocupation = "Cooker";
        sanji.reward = 330000000;


        
        showPirate(luffy);
        capturePirate(luffy);

        //Scanner input = new Scanner(System.in);
        //System.out.println("Escolha um de 1 a 7:");
        //int num = input.nextInt();
        

    }
}
