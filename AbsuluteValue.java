//Take integer input and print the absolue value of that integer
import java.util.Scanner;
public class AbsuluteValue {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
       // if (num < 0) {
       //     System.out.println("Absolute value is: " + (-num));
        
       // } else{
     //       System.out.println("Absolute value is:" + (num));
      //  }
        if (num < 0) {
            num = -num;
        }
        System.out.println("Absolute value is: " + num);
        sc.close();
    }


}
