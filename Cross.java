package Pattern;
import java.util.Scanner;
public class Cross {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Row: ");
        int row = sc.nextInt();
        if (row%2!=0){
            for (int i=1; i<=row; i++){
                for (int j=1; j<=row; j++){
                    if ((i==j) || (i+j) == (row+1)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
                System.out.println("Please enter an ODD number");
            }
            else {
            System.out.println("Please enter an ODD number");
        }
        sc.close();
    }
}
