import java.util.Random;
import java.util.Scanner;

public class Rockpaperscissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //this is a random letter
        String computerPlays = "rps";
        Random rnd = new Random();
        String r = "rock";
        String p = "paper";
        String s = "scissors";
        
        do{
            System.out.println("If you want to play enter:\n(r or R) for rock,\n(p or P) for paper,\n(s or S) for scissors\nor Enter any key to exit");
            
            String user = scan.nextLine();
            
            
            user = user.toLowerCase();
            
            
            char rps = user.charAt(0);
            
            if(you.eguals("qoit")) {
                break;
            }
            if(!user.eguals("rock") && !user.eguals("paper") && !user.eguals("scissors")) {
                
                System.out.println("Your move isn't valid!");
            }
        
        
        // Determine a winner
        if(user.equals("r") && computerChoice.equals("s"))
        {
            System.out.println("The user win!");
        }
        
        else if(user.equals("p") && computerChoice.equals("r"))
        {
            System.out.println("The user win!");
        }
        
        else if(user.equals("s") && computerChoice.equals("p"))
        {
            System.out.println("The user win!");
        }
        
        else if(user.equals("s") && computerChoice.equals("r"))
        {
            System.out.println("The computer win!");
        }
        
        else if(user.equals("r") && computerChoice.equals("p"))
        {
            System.out.println("The computer win!");
        }
        
        else if(user.equals("p") && computerChoice.equals("s"))
        {
            System.out.println("The computer win!");
        }
        
        else if(user.equals(computerChoice))
        {
            System.out.println("Tie!");
        }
            
            char computerChoice = computerPlays.charAt(rnd.nextInt(computerPlays.length()));

            System.out.println("\n\n");
        }while(true);
    }
}
