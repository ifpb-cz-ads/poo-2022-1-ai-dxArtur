import java.lang.reflect.Member;
import java.util.Scanner;

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
    protected Pirate[] members;
    //protected String[] jobs = {"Captain", "Chief officer", "Cooker", "Navigator", "Pilot", "Sniper", "Musician", "Doctor", "Archaeologist", "Shipwright", "Crew Members"};
    protected String ship;

    public Tripulation(){

    }

    public Tripulation(String name, Pirate[] members, String ship){
        this.name = name;
        this.members = members;
        //how to define like a atributte one array of objects
        this.ship = ship;
    }

    

    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public Pirate[] getMembers(){
        return this.members;
    }
    
    public void setMembers(Pirate members[]){
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
    }

    public Pirate(String name, String nick, String akumanomi, String haki, String ocupation, boolean status, int reward){
        super(name, nick, akumanomi, haki);
        this.ocupation = ocupation;
        this.status = status;
        this.reward = reward;
        this.tripulation = tripulation;
    
    
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

    public String tripulationNull(){
        return "No have tripulation";
    }

    public Tripulation getTripulation(){
        if(this.tripulation == null){
            tripulationNull();
        }else{
            return this.tripulation;
        }
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
        //for
        System.out.print("Now, the pirate of the tripulation is a ocupation on the board tripulation");
    }

    static void showPirate(Pirate pirate){
        System.out.println("Your full name is: " + pirate.getName());
        System.out.println("know as: " + pirate.getNick());
        System.out.println("Your reward is: " + pirate.getReward());
        System.out.println("===== more informations =====");
        //Pirate.tripulation = trpltn;
        System.out.print("Actually is: " + pirate.getOcupation() + "on board on: " + pirate.tripulation.getShip());//tripulation.name
        
    }

    static void showSailor(Sailor sailor){

    }
    
    static void capturePirate(Pirate pirate){
        if(pirate.status != true){
            System.out.println("The Notorius pirate " + pirate.nick + " was captured");
        } else {
            System.out.println("The Pirate " + pirate.nick + " is already captured");
        }

    }
    

    public static void main(String[] args){
        //Create my first object
        //Pirate luffy = new Pirate("Monkey D. Luffy", "Mugiwara no Luffy", "H");

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

        Tripulation mugiwara = new Tripulation();

        mugiwara.name = "Mugiwara Pirates";
        Pirate[] members = {luffy, sanji};
        mugiwara.setMembers(members);
        mugiwara.ship = "Thousand Sunny";
 
        
        showPirate(luffy);
        showPirate(sanji);

 
        

    }
}
