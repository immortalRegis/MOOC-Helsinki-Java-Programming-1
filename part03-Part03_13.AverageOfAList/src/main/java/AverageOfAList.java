
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Double> holder = new ArrayList<>();
        
        while(true){
            double number = Double.valueOf(scanner.nextLine());
            if( number == -1 ){
                break;
            }
            holder.add(number);
        }
        double average = 0.0;
        
            
        double sum = 0;
        int count = 0;
            
        for(Double num: holder){
            sum = sum + num;
            count++;
            System.out.println(count +" and " + sum);
        }
            
        if(count > 0){
            average = sum/count;
        }
        
        System.out.println("Average: " + average);
        
        
    }
}
