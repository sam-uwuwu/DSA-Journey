// print 123456
//       12345 
package Pattern;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Rows");
        int row = sc.nextInt();
        System.out.println("Coloumn");
        int coloumn = sc.nextInt();
        for (int i=1; i<=row; i++){
            for (int j=1; j<=coloumn; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
