package Loops;
import java.util.Scanner;
public class spl_AP {
    public static void main(String[] arga){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int a = 2, d = 3;
        for (int i=1; i<=n; i++){
            System.out.print(a+ " ");
            a += d;
        }
        sc.close();
    }
}
