
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageOfOldest = 0;
        String nameOfOldest = "";
        
        while(true){
            String details = scanner.nextLine();
            if(details.isEmpty()){
                break;
            }
            
            String[] splitDetails = details.split(",");
            
            int age = Integer.valueOf(splitDetails[1]);
            
            if(age > ageOfOldest){
                ageOfOldest = age;
                nameOfOldest = splitDetails[0];
            }
            
        }
        
        System.out.println("The name of the oldest: " + nameOfOldest);
    }
}
