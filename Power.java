package Loops;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the base number: ");
        int base = sc.nextInt();
        System.out.println("Enter the exponent: ");
        int exponent = sc.nextInt();
        int power = 1;
        while (exponent>0){
            power *= base;
            exponent--;
        }
        sc.close();
        System.out.println("The result is: " + power);
    }
}
