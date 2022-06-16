
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
            } 
            if(value < 0){
                continue;
            }
            
            numberCount++;
            sum += value;
        }
        if(numberCount > 0){
            average = (double) sum/numberCount;
            System.out.println(average);
        } else{
            System.out.println("Cannot calculate the average");
        }
    }
}
