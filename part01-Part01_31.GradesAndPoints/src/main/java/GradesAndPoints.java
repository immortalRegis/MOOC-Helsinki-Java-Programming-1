
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int value = Integer.valueOf(scan.nextLine());
        
        if(value < 0){   
            System.out.println("Grade: impossible!");
        } else if (value < 50){
            System.out.println("Grade: failed");
        } else if (value < 60){
            System.out.println("Grade: 1");
        } else if (value < 70){
            System.out.println("Grade: 2");
        }else if (value < 80){
            System.out.println("Grade: 3");
        }else if (value < 90){
            System.out.println("Grade: 4");
        }else if (value < 101){
            System.out.println("Grade: 5");
        } else{
            System.out.println("Grade: incredible!");
        }
            
    }
}
