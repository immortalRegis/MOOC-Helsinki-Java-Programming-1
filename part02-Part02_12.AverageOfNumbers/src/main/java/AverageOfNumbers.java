
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0; 
        int numberCount = 0;
        int value;
        double average;
                
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
        average = (double) sum/numberCount;
        
        System.out.println("Average of the numbers: " + average);
    }
}
