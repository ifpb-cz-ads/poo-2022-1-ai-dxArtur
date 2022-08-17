import java.lang.reflect.Member;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;

abstract class Peaple{
    protected String name;
    protected String nick;
    protected String akumanomi;
    protected String haki;

    public Peaple(String name, String nick, String akumanomi, String haki){
        this.name = name;
        this.nick = nick;
        this.akumanomi = akumanomi;
        this.haki = haki;
    }
    
    public Peaple() {
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getNick(){
        return this.nick;
    }
    
    public void setNick(String nick){
        this.nick = nick;
    }
    
    public String getAkumanomi(){
        return this.akumanomi;
    }
    
    public void setAkumanomi(String akumanomi){
        this.akumanomi = akumanomi;
    }
    
    public String getHaki(){
        return this.haki;
    }
    
    public void setHaki(String haki){
        this.haki = haki;
    }
    
}
// as classes Pirate e Sailor são classes abstratas de Peaple 


class Tripulation{
    protected String name;
    protected ArrayList<Pirate> members;
    protected String ship;

    

    public Tripulation(){

    }

    public Tripulation(String name, ArrayList<Pirate> members, String ship){
        this.name = name;
        this.members = members;
        this.ship = ship;
    }

    
    

    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public  ArrayList<Pirate> getMembers(){
        return this.members;
    }
    
    public void setMembers(ArrayList<Pirate> members){
        this.members = members;
    }

    public String getShip(){
        return this.ship;
    }

    public void setShip(String ship){
        this.ship = ship;
    }

    
}

class Pirate extends Peaple{
    
    protected String ocupation;
    protected boolean status;
    protected int reward;
    protected Tripulation tripulation;

    

    
    public Pirate(){
        super();
        this.status=true;
    }

    public Pirate(String name, String nick, String akumanomi, String haki, String ocupation, boolean status, int reward){
        super(name, nick, akumanomi, haki);
        this.ocupation = ocupation;
        this.status = status;
        this.reward = reward;
        //this.tripulation = tripulation;
    
    
    }

    public String getOcupation(){
        return this.ocupation;
    }

    public void setOcupation(String ocupation){
        this.ocupation = ocupation;
    }

    public Boolean getStatus(){
        return this.status;
    }

    public void setStatus(Boolean status){
        this.status = status;
    }

    public int getReward(){
        return this.reward;
    }

    public void setReward(int reward){
        this.reward = reward;
    }

    
    public Pirate(String name, String nick, String akumanomi, String haki, String ocupation, boolean status, int reward, Tripulation tripulation){
        super(name, nick, akumanomi, haki);
        this.ocupation = ocupation;
        this.status = status;
        this.reward = reward;
        this.tripulation = tripulation;
    }



    public Tripulation getTripulation(){
        return this.tripulation;
    }

    public void setTripulation(Tripulation tripulation){
        this.tripulation=tripulation;
    }
}

class Sailor extends Peaple{
    protected String ocupation;

    public Sailor(String name, String nick, String akumanomi, String haki, String ocupation){
        super(name, nick, akumanomi, haki);
        this.ocupation = ocupation;
    }

    public String getOcupation(){
        return this.ocupation;
    }
    public void setOcupation(String ocupation){
        this.ocupation = ocupation;
    }
}





public class marine{

    
    static void moveTripulation(Pirate pirate, Tripulation tripulation){
        
        System.out.print("Now, the pirate of the tripulation is a ocupation on the board tripulation");
    }

    static void showPirate(Pirate pirate){
        System.out.println("The Pirate");
        System.out.println("Your full name is: " + pirate.getName());
        System.out.println("know as: " + pirate.getNick());
        //System.out.println(pirate.getStatus());
        if(pirate.getStatus()==true){
            System.out.println("The pirate is free");
        }else{
            System.out.println("The pirate is trapped");
        }
        System.out.println("Your reward is: " + pirate.getReward());
        System.out.println("===== more informations =====");
        
        if (pirate.tripulation != null) {
            System.out.println("Actually is: " + pirate.getOcupation() + "on board on: " + pirate.tripulation.getShip());//tripulation.name
        }
        else {
            System.out.println("Actually no have tripulation");
        }
        System.out.println("=============================");

    }

    static void showSailor(Sailor sailor){
        System.out.println("The Sailor");
        System.out.println("Your full name is: " + sailor.getName());
        System.out.println("know as: " + sailor.getNick());
        System.out.println("Actually your ocupation is: " + sailor.getOcupation());
    }
    
    static void capturePirate(Pirate pirate){
        //System.out.println(pirate.getStatus());
        if(pirate.getStatus() == true){
            System.out.println("The Notorius pirate " + pirate.getNick() + " was captured");
            pirate.setStatus(false);
        }else{
            System.out.println("The Pirate " + pirate.getNick() + " is already captured");
        }
        //System.out.println(pirate.getStatus());
    }

    static void showTripulation(Tripulation tripulation){
        System.out.println("The crew");
        System.out.println("The name is: " + tripulation.getName());
        System.out.println("On board of the ship: " + tripulation.getShip());
        System.out.println("Actually is composed by " + tripulation.getMembers().size() +" pirates");
    }

    static void showMembersTripulation(Tripulation tripulation){
        System.out.println("The crew is made up of are: ");
        for (int i=0; i<tripulation.getMembers().size(); i++){
            System.out.println(tripulation.members.get(i));
        }
    }
    

    public static void main(String[] args){
    

        Pirate luffy = new Pirate();

        luffy.name = "Monkey D. Luffy";
        luffy.nick = "Mugiwara no Luffy";
        luffy.akumanomi = "Hito Hito no mi model God Sun";
        luffy.ocupation = "Captain";
        luffy.reward = 1500000000;

        showPirate(luffy);
        

        Pirate sanji = new Pirate();

        sanji.name = "Vinsmoke Sanji";
        sanji.nick = "Black Leg Sanji";
        sanji.akumanomi = "no have";
        sanji.ocupation = "Cooker";
        sanji.reward = 330000000;

        showPirate(sanji);

        Pirate eustass = new Pirate();
        eustass.name = "Eustass Kid";
        eustass.nick = "Captain Kid";
        eustass.akumanomi = "jiki jiki no mi";
        eustass.ocupation = "Captain";
        eustass.reward = 470000000;
        eustass.status = false;



        Tripulation mugiwara = new Tripulation();

        mugiwara.name = "Mugiwara Pirates";
        //Pirate[] members = {luffy, sanji};
        //mugiwara.setMembers(members);
        mugiwara.ship = "Thousand Sunny";

        ArrayList<Pirate> members = new ArrayList<> ();
        members.add(luffy);
        members.add(sanji);
        mugiwara.setMembers(members);
        
        luffy.tripulation = mugiwara;
        sanji.tripulation = mugiwara;
        
        showPirate(luffy);
        showPirate(sanji);
        showPirate(eustass);
        capturePirate(luffy);
        capturePirate(eustass);

        showTripulation(mugiwara);
        showMembersTripulation(mugiwara);

        
        /*
        int option = 10;
	    while (option != 0) {
		
		//MENU PRINCIPAL WITH OPTIONS
		option = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "1: Show Pirate \n"
				+ "2: Show Crew \n"
				+ "3: Show Sailor \n"
				+ "4: Show Crew Members \n"
				+ "5: Capture Pirate \n"
				+ "Choose your option! \n"
				+ "Type 0 for esc"));
		
		//CASOS
		switch (option) {
		case 1: 
            //
			break;
		case 2:
			//
			break;
		case 3:
			//
			break;
		case 4:
			//
			break;
		case 5:
			//
			break;
		default: System.out.println ("error");
			break;
		}
		
		
	}
*/
 
        

    }
}
