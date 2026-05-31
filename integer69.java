//Take a integer input and tell if its magnitude is less than 69 or not
import java.util.Scanner;
public class integer69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         System.out.println("The magnititude is:" );

        int magnititude = sc.nextInt();
       
        if (magnititude <= 69){
            System.out.println("The magnititude is less than or equal to69");
        }
        else{
            System.out.println("The magnititude is greater than 69");
        }
        sc.close();
    }
    
}
