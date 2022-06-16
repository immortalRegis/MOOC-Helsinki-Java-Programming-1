
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageOfOldest = 0;
        
        while(true){
            String details = scanner.nextLine();
            if(details.isEmpty()){
                break;
            }
            
            String[] splitDetails = details.split(",");
            
            int age = Integer.valueOf(splitDetails[1]);
            
            if(age > ageOfOldest){
                ageOfOldest = age;
            }
            
        }
        
        System.out.println("The age of the oldest: " + ageOfOldest);

    }
}
