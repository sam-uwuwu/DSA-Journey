package Loops;
import java.util.Scanner;
public class ntimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of times you want to See Yashika's name: ");
        int i, n;
        n = sc.nextInt();
        for (i=n; i>=1; i--){
            System.out.println("Yashika");
        }
        sc.close();
    }
}
