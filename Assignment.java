import java.util.Scanner;
public class Assignment1 {
  public static void main(String[] args) {
      float num1,num2;
      Scanner myScanner = new Scanner(System.in);
      
      num1 = myScanner.nextFloat();
      num2 = myScanner.nextFloat();

      System.out.println(num1+num2);
      
      System.out.println(num1-num2);
      
      System.out.println(num1*num2);
      
      System.out.println(num1/num2);
      
      System.out.println(num1%num2);
      
      System.out.println(num1!=num2);
      
      System.out.println(num1>num2);
      
      System.out.println(num1<num2);
      
      System.out.println(num1>=num2);
      
      System.out.println(num1<=num2);
  }
}
