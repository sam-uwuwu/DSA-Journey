// take a positive integer input and print 
// Riya if the number is divisible by 3 
// sam if the number is divisible by 5 
// Radhe if the number is not divisible by 5 & 3 both 
// Krishna if the number is divisible by 5 or 3
import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a positive Number:");
        Double num = sc.nextDouble();
        if (num %3 ==0){
            System.out.println("Riya");
        }
        else if (num % 5 ==0){
            System.out.println("Sam");
        }
        else if (num % 3 == 0 && num % 5 == 0){
            System.out.println("Radhe");
        }
        else{
            System.out.println("Krishna");
        }
        sc.close();
    }
    
}
