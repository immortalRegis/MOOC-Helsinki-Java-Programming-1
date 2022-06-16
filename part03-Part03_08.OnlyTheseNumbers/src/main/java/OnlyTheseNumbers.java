
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        int start, stop;
        
        System.out.println("From where?");
        start = Integer.valueOf(scanner.nextLine());
        
        System.out.println("To where?");
        stop = Integer.valueOf(scanner.nextLine());
        
        for(int i = start; i <= stop; i++){
            System.out.println(numbers.get(i));
        }
    }
}
