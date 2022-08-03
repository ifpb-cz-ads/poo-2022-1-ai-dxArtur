import java.util.Scanner;

public abstract class Peaple{
    protected String name;
    protected String nick;
    protected String akumanomi;
    protected String haki;

    public Peaple(){
    this.name = name;
    this.nick = nick;
    this.akumanomi = akumanomi;
    this.haki = haki;
    }
}
// as classes Pirate e Sailor são classes abstratas de Peaple 



class Pirate extends Peaple{
    protected String ocupation;
    protected Tripulation tripulation;
    protected boolean status;
    protected int reward;
    
    public Pirate(){
    this.ocupation = ocupation;
    this.status = status;
    this.reward = reward;
    //how to increament object Tripulation like a atributte for class Pirate
    }
}

class Sailor extends Peaple{
    protected String ocupation;
    
    public Sailor(){
    this.ocupation = ocupation;
    }
}

class Tripulation{
    String name;
    String[][] membersJobs;
    Pirate[] members;
    String[] jobs = {"Captain", "Chief officer", "Cooker", "Navigator", "Pilot", "Sniper", "Musician", "Doctor", "Archaeologist", "Shipwright", "Crew Members"};
    String ship;
}



public class marine{

    static void addPirate(){
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter a full pirate name: ");  
        String fullname= sc.nextLine();
    }

    static void moveTripulation(Pirate pirate, Tripulation tripulation){
        //for
        System.out.print("Now, the pirate of the tripulation is a ocupation on the board tripulation");
    }

    static void showPirate(Pirate pirate){
        System.out.println("Your full name is: " + pirate.name);
        System.out.println("know as: " + pirate.nick);
        System.out.println("Your reward is: " + pirate.reward);
        System.out.println("");
        System.out.println("===== more informations =====");
        //System.out.print("Actually is: " + pirate.ocupation + "on board on: " + pirate.tripulation.ship);//tripulation.name
        
    }
    
    static void capturePirate(Pirate pirate){
        if(pirate.status != true){
            System.out.println("The Notorius pirate " + pirate.nick + " was captured");
        } else {
            System.out.println("The Pirate " + pirate.nick + " is already captured");
        }

    }
    
    static void createTripulation(String tripulation){
        
        
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
        //luffy.tripulation = mugiwara.name;
        //como definir a tripulação dele: luffy.tripulation


        System.out.print("");

        Pirate sanji = new Pirate();

        sanji.name = "Vinsmoke Sanji";
        sanji.nick = "Black Leg Sanji";
        sanji.akumanomi = "no have";
        sanji.ocupation = "Cooker";
        sanji.tripulation = mugiwara;
        sanji.reward = 330000000;


        

        // como passar uma instancia como o parametro
        showPirate(luffy);
        showPirate(sanji);
        //capturePirate(luffy);

 
        

    }
}
