import java.util.Scanner;
public class Assignment {  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mynum1 = scan.nextInt();
        int mynum2 = scan.nextInt();
        if (mynum1 < mynum2){
        System.out.println("");
         }else{ 
         System.out.println("num1("+mynum1+")is grater than num2("+mynum2+")");
        System.out.format("num2(%d)is grater than num1(%d)",mynum2,mynum1);
        
	}
}
}
