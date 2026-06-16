package Pattern;
import java.util.Scanner;
public class Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Row: ");
        int row = sc.nextInt();
        if (row%2!=0){
        for (int i=1; i<=row; i++){
            for (int j=1; j<=row; j++){
                if (i==(row+1)/2 || j==(row+1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            }
        }
        else{
            System.out.println("Please enter an ODD number");
        }
        sc.close();
    }
}
