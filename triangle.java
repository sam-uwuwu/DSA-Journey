//take 3 positive integers input and tell if they can be the sides of a triangle or not
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1, num2, num3;
        System.out.println("Enter the first side");
        num1 = sc.nextInt();
        System.out.println("Enter the Second side");
        num2 = sc.nextInt();
        System.out.println("Enter the third side");
        num3 = sc.nextInt();
        if(num1+num2 > num3 && num2+num3 > num1 && num1+num3 > num2){
            System.out.println("The side can form a trianle");

        }
        else{
            System.out.println("The side cannot form a triangle");
        }
        sc.close();
    }
    
}
