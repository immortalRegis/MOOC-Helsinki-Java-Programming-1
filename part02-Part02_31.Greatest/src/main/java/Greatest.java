
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int largest;
        if(number1 > number2){
            if(number1 > number3){
                largest = number1;
            } else {
                largest = number3;
            }
        } else {
            if(number2 > number3){
                largest = number2;
            } else {
                largest = number3;
            }
        }
        return largest;
        
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
