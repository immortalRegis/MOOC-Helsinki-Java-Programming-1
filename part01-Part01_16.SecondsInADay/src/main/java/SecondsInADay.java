
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int num = Integer.valueOf(scanner.nextLine());
        
        int numOfSeconds = 86400 * num;
        System.out.println(numOfSeconds);
    }
}
