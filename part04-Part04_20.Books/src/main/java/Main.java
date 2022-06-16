import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> holder = new ArrayList<Book>();
                
        while(true){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            if(name.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            holder.add(new Book(name, pages, year));
        }
        
        System.out.print("What information will be printed? ");
        String response = scanner.nextLine();
        
        if (response.equals("everything")){
            for(Book bk: holder){
                System.out.println(bk);
            }
        }
        else if (response.equals("name")){
            for(Book bk: holder){
                System.out.println(bk.getName());
            }
        }
          
    }
}
