
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();
        
        try(Scanner sc = new Scanner(Paths.get(fileName))){
            while(sc.hasNextLine()){
                String record = sc.nextLine();
                String[] holder = record.split(",");
                String year = "years";
                
                if(holder[1].equals("1")){
                    year = "year";
                }
                System.out.println(holder[0] + ", age: " + holder[1] +" " + year);
            }
        }
        catch(Exception e){
            System.out.println("Failed to read " + fileName);
        }
    }
}
