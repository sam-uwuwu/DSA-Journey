// package Loops;
// import java.util.Scanner;
// public class Count_Numbers {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner (System.in);
//     System.out.println ("Enter a number:");
//     int num = sc.nextInt();
//     int i = 0;
//     while(i<=num){
        
//         System.out.println(i);
//         i++;
//         }
//         sc.close();
//     }
// }
  

// package Loops;
// import java.util.Scanner;

// public class Count_Numbers {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number:");
//         int num = sc.nextInt();

//         int i = 0;

//         while (i <= num) {
//             System.out.println(i);
//             i++;
//         }

//         sc.close();
//     }
// }

package Loops;
import java.util.Scanner;
public class Count_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a number ");
        int n =sc.nextInt();
        for (int count=1; n!=0; n/=10, count++){
                System.out.println(count);
        }
        sc.close();
    }
}