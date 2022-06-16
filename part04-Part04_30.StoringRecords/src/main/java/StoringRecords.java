
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
               
        try(Scanner fr = new Scanner(Paths.get(file))){
            while(fr.hasNextLine()){
                String record = fr.nextLine();
                String[] holder = record.split(",");
                
                String name = holder[0];
                int age = Integer.valueOf(holder[1]);
                
                Person individual = new Person(name, age);
                persons.add(individual);
            }
        }
        catch(Exception e){
            System.out.println("Unable to read file " + file);
        }
        
        return persons;

    }
}
