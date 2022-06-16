
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String word = scan.nextLine();
        
        System.out.println("Give an integer:");
        int num1 = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double num2 = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean val = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + word);
        System.out.println("You gave the integer " + num1);
        System.out.println("You gave the double " + num2);
        System.out.println("You gave the boolean " + val);
    }
}
