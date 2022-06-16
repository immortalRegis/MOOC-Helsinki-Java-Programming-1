
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
       
        
        for(int i = (number -1); i >0; i--){
            number *= i;
        }
        
        System.out.println("Factorial: " + number);
    }
}
