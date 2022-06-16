
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int numberCount = 0;
        
        try(Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                int readNumber = Integer.valueOf(sc.nextLine());
                if((readNumber >= lowerBound)&&(readNumber <= upperBound)){
                    numberCount += 1;
                }
            }
        }
        catch(Exception e){
            System.out.println("File not found : " + e);
        } 
        
        System.out.println("Numbers: " + numberCount);

    }

}
