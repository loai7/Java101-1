import java.util.Scanner;
//Get to know the Scanner Library
public class Assignment {
	public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1 or 2");
		//Ask the user to choose 1 or 2
	   	int var= scan.nextInt();
	   
		switch(var) {
  
		case 1:
	    //If he chooses 1, it prints the circle
		System.out.println("Enter semicircle");
		//Ask the user to enter the text of the circle
		int var2 = scan.nextInt();
		System.out.println(3.14*var2*var2);
		break;
		
		case 2: 
		//If he chooses 2, the box will be printed
		System.out.println("Enter  height");
		//Ask the user to enter the length
		
		int var3 = scan.nextInt();
		System.out.println("Enter number offer");
		//Ask the user to enter the offer
		int var4 = scan.nextInt();
		System.out.println(var3 * var4);
	break;
	
		default:
		System.out.println("Error, enter either 1 or 2");
		}
		
		
		
		
	    
		
	}
}
