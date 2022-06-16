
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> holder = new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        while (true)
        {
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 9999){
                break;
            }
            holder.add(number);
        }
       
        if(holder.size() > 0)
        {
            int smallest = holder.get(0);
            int i = 0;
            while( i < holder.size()){
                if(holder.get(i) < smallest){
                    smallest = holder.get(i);
                }
                i++;
            }
         
            System.out.println("Smallest number: " + smallest);
            for(int j = 0; j < holder.size(); j++){
                if(holder.get(j) == smallest){
                    System.out.println("Found at index: " + j);
                }
            }
            
        }
        
    }
}
