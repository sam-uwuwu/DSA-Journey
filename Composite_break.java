package Loops;
import java.util.Scanner;
public class Composite_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // for (int i=2; i<n; ){
        //     if (n%i==0){
        //         System.out.println("Composite Number.");
                
        //     }
        //     else{
        //         System.out.println("Not a Composite number.");
        //         break;
        //     }
        // }
        boolean isComposite = false;
        for (int i=2; i<n; i++){
            if (n % i == 0){
                isComposite = true;
                break;
            }

        }
        if (isComposite){
            System.out.println("Composite Number");
        }
        else{
            System.out.println("Not a Composite Number");
        }

        sc.close();
    }
}
