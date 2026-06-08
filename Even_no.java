package Loops;
import java.util.Scanner;
public class Even_no {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if (n%2==0){
        for (i=2; i<=n; i= i+2){
            System.out.println(i);
        }
    }
        else {
            System.out.println("Please enter an odd digit value.");
        }
        sc.close();
    }
}
