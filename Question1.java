package Pattern;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number of rows:");
    int rows = sc.nextInt();
    System.out.println("Enter the number of Coloumn;");
    int coloumn = sc.nextInt();
    for (int i=1; i<=rows; i++){
        for (int j=1; j<=coloumn; j++){
            System.out.print("@ ");
            }
            System.out.println();
        }
        sc.close();
    }
}
