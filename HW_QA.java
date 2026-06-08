//take a num,ber input and write the factores of the numbers 
package Loops;
import java.util.Scanner;
public class HW_QA {
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    for (int i=2;i<=Math.sqrt(num); i++){
        if (num%i==0){
            if (i==2) continue;
            System.out.println(i);
            System.out.println(num/i);
            }
        }
        sc.close();
    }
}