import java.util.Scanner;
public class Square_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Value :");
        int value = sc.nextInt();
        System.out.println("Square of a Number is : " + (value * value));
        sc.close();
    }
    
}
