
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int number1 = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Enter the second number: ");
        int number2 = Integer.valueOf(scanner.nextLine());
        
        System.out.println((double) Math.sqrt(number1 + number2));
    }
}
