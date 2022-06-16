
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        String firstName, lastName, idNumber;
        
        while(true){
            System.out.print("First name: ");
            firstName = scanner.nextLine();
            if (firstName.isEmpty()){
                break;
            }
            
            System.out.print("Last name: ");
            lastName = scanner.nextLine();
            
            System.out.println("Identification number: ");
            idNumber = scanner.nextLine();
            
            PersonalInformation person = new PersonalInformation(firstName, lastName, idNumber);
            infoCollection.add(person);
        }
        
        System.out.println();
        for(PersonalInformation person: infoCollection){
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

    }
}
