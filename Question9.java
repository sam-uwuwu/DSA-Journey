package Pattern;
import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Rows:");
        int rows = sc.nextInt();
        for (int i=1; i<=rows; i++){
            if (i%2!=0){
                for (int j=1; j<=i; j++){
                    System.out.print(j+" ");
            }
        }
            else  {
                for (int j=1; j<=i;j++){
                    System.out.print((char)(j+64)+" ");
                }
                
            }
            System.out.println();
        }
        sc.close();
    }
}
