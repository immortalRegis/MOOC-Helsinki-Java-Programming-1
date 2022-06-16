
import java.util.Scanner;

public class AVClub {

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
                if(word.contains("av")){
                    System.out.println(word);
                }
            }       
        }
    }
}
