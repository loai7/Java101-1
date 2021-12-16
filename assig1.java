import java.util.Scanner;
public class Assignment {  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float myNum = scan.nextFloat();
        
        if (myNum>0){
            myNum = myNum-1;
          System.out.println(myNum);  
        }

        else if (myNum<0){
        System.out.println(myNum+1);
        }
        else 
        System.out.println(0);
    }
}
