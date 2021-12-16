public class Assignment {  
    public static void main(String[] args) {
    int counterX = 1;
    while(counterX <= 5){
        int counterY = 1;
        while (counterY <= counterX){
        System.out.print("*");
        ++counterY;
    }
    System.out.println();
    ++counterX;
	}
    }
}
