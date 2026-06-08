package Loops;
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the n'th number:");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println(i);
            System.out.println(n-i+1);
        
        }
        sc.close();
    }
}
