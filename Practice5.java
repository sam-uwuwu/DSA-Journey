//Q. Program to count digits in a number.
import java.util.Scanner;
public class Practice5 {
public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int count = 0;
    if (num ==0) {
        count = 1;
    } else {
        while (num != 0){
            num = num/10;
            count++;
        }
    }
    System.out.println("Number of digit = " + count);
    sc.close();
 }
}
