import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Name: ");
            String movieName = scanner.nextLine();
            
            if(movieName.isEmpty()){
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            
            TelevisionProgram prog = new TelevisionProgram(movieName, duration);
            
            programs.add(prog);
            
        }
        
        System.out.print("Program's maximum duration? ");
        int max_duration = Integer.valueOf(scanner.nextLine());
        
        for(TelevisionProgram p:programs){
            if(max_duration >= p.getDuration()){
                System.out.println(p);
            }
        }
    }
}
