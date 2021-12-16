import java.util.Scanner;
public class Assignment {
     public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int mynum = scan.nextInt();
        mynum = mynum %2;
        if (mynum==0)
        System.out.println("EVEN");
        else 
        System.out.println("odd");
    }
}
