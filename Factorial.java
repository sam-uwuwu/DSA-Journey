package Loops;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number to find its factorial: ");
        int num = sc.nextInt();
        int factorial = 1;
        while (num>0) {
            factorial = factorial * num;
            num--;
        }
        sc.close();
    }
}
