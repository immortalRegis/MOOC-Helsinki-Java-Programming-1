
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        
        while(true){
            line = scanner.nextLine();
            if(line.isEmpty()){
                break;
            }
            String[] holder = line.split(" ");
           
            for(String word: holder){
                System.out.println(word);
            }       
        }
    }
}
