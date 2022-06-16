
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int counter = 0;
        
        while(counter < number){
            System.out.print("*");
            counter++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int counter = 0;
        
        while(counter < number){
            System.out.print(" ");
            counter++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int spaces = size - 1;
        int stars = 1;
        while(spaces >= 0){
            printSpaces(spaces);
            printStars(stars);
            stars++;
            spaces--;
        }
 
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int spaces = height - 1;
        int stars = 1;
        
        while(spaces >= 0){
            printSpaces(spaces);
            printStars(stars);
            stars+=2;
            spaces--;
        }
        
        for(int i = 0; i < 2; i++){
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
