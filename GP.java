package Loops;
import java.util.Scanner;
public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enetr the first term of the GP");
        double a = sc.nextDouble();
        System.out.println("Enter the common ratio of the numbers");
        double r = sc.nextDouble();
        System.out.println("Enter the number of terms you want to print");
        double n = sc.nextDouble();
        for (int i=1; i<=n; i++){
            System.out.println( a);
        a *= r;
        }
        sc.close();
    }
}
