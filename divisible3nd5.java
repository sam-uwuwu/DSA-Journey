//Take positive integer input and  tell if it is divisible by both 3 and 5
import java.util.Scanner;
public class divisible3nd5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("The number is didvisible by both 3 and 5");
        }
        else{
            System.out.println("The nummber is not divisible by both 3 and 5");
        }
        sc.close();
    }
}
