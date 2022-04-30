import java.util.Scanner;

class pirate{
    String name;
    String nick;

    String akumanomi;
    String ocupation;
    String tripulation;
    int reward;
}

public class marine{

    static void addPirate(pirate){
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter a full pirate name: ");  
        String fullname= sc.nextLine();
    }

    static void showPirate(){
        System.out.println("Your full name is:" + name);
        System.out.println("know as:" + name);
        System.out.println("Your reward is:" + reward);
        System.out.println("===== more informations =====");
        System.out.print(" .");
        
    }
    
    static void capturePirate(){
        System.out.println("The Notorius pirate" +name "has been captured");
    }

    public static void main(String[] args){
        -addPirate();
    }
}
