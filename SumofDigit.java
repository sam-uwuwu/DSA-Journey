package Loops;
import java.util.Scanner;
public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a number:");
        
        int num = sc.nextInt();
        //WHILE LOOP
        // int sum = 0;
        // while (num!=0){
        //     sum += num%10;
        //     num /= 10;
        // }
        // System.out.println ("The sum of the digits is: " + sum);
        //FOR LOOP
        //int sum=0 ;
        // for (; num!=0;  num/=10){
        //     sum+=num%10;
        // }
        // System.out.println ("The sum of the digits is: " + sum);
        //DO WHILE LOOP
        int sum = 0;
        do {
            sum += num%10;
            num /= 10;

        }
        while (num!=0);
        System.out.println((sum>0) ? sum : -sum);
        sc.close();
    }
}
