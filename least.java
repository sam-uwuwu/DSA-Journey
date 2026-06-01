//take 3 positive integer and find the least number among them
import java.util.Scanner;
public class least {
    public static void main(String[] args) {
       Scanner sb = new Scanner (System.in);
       System.out.println("Eneter the first number");
       int a = sb.nextInt();
       System.out.println("Eneter the second number");
       int b = sb.nextInt();
         System.out.println("Eneter the third number");
         int c = sb.nextInt();
         if (a<b){
            if (a<c) System.out.println("The Least number is:" + a);
        else System.out.println("The least number is :" + c);
         }
         else{
            if (b<c) System.out.println("The Least number is:" + b );
            else System.out.println("The least number is : " + c);
         }
         sb.close();
         }
    
}
