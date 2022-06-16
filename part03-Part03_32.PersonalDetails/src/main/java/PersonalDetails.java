
//import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total, average;
        int count;
        
        total = 0.0;
        average = 0.0;
        count = 0;
        String longestName = "";
        
        while(true){
            String details = scanner.nextLine();
            
            if(details.isEmpty()){
                break;
            }
            
            String[] holder = details.split(",");
            
            if(holder[0].length() > longestName.length()){
                longestName = holder[0];
            }
            
            total += Double.valueOf(holder[1]);
            count++;
            
        }
        if(count > 0){
            average = total/ count;
            System.out.println("Longest name: " + longestName);
            System.out.println("Average of the birth years: " + average);
        }
        
    }
}
