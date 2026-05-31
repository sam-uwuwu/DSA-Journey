// Take Real Number Input anmd check if it is positive or negative 
import java.util.Scanner;
public class RealNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a real number: ");
        double num = sc.nextDouble(); // num = 3.14567
        // if (num < 0){
        //     System.out.println("The number is negative");

        // }
        // else {
        //     System.out.println("The number is Positie");
        // }
        int sam = (int) num; //sam = 3
        if ( num - sam > 0)System.out.println("The number is positive");
        else System.out.println("The number is negative");
        sc.close();
    }
    
}
