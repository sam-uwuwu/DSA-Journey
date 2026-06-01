// Take positive integer input and tell it is a four digit numbers or not 
import java.util.Scanner;
public class four_number {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Write the number: ");
    int num = sc.nextInt();
    if (num >999 && num < 10000){
        System.out.println("This is a four digit number");
    }
    else{
        System.out.println("This is not a four digit number");
    }
    sc.close();
}
    
}
