/*Write a program to check even/odd.
public class Practice2 {
    public static void main(String[] args) {
       int n = 29;
        if (n % 2 == 0){
            System.out.println(n + " is even number");
        }
        else {
            System.out.println(n + " is odd number");
        }
    }
    
} */
//Write a program to check even/odd. Use input method
import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number:");

        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println ( number + " is even number:");
        }
        else {
            System.out.println( number + " is odd number");
        }
        scanner.close();
    }
    
}
