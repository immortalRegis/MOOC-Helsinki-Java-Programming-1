
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = 0;
        int value;
        
        while(true){
            System.out.println("Give a number: ");
            value = Integer.valueOf(scanner.nextLine());
            
            if(value == 0){
                break;
            } else {
                numberCount++;
            }
         
           
        }
        System.out.println("Number of numbers: " + numberCount);
    }
}
