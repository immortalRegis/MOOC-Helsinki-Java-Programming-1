
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       String line;
        
        while(true){
            line = scanner.nextLine();
            if(line.isEmpty()){
                break;
            }
        String[] holder = line.split(" ");
           
        System.out.println(holder[holder.length - 1]);
        }       


    }
}
