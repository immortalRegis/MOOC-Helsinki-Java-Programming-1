
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0; 
        int numberCount = 0;
        int value;
        
        while(true){
            System.out.println("Give a number: ");
            value = Integer.valueOf(scanner.nextLine());
            
            if(value == 0){
                break;
            } else {
                numberCount++;
                sum += value;
            }
         
           
        }
        
        System.out.println("Number of numbers: " + numberCount);
        System.out.println("Sum of the numbers: " + sum);
    }
}
