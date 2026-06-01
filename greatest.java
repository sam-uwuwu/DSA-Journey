// import java.util.Scanner;
// public class greatest {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter three number:");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         if (a >= b && a >= c){
//             System.out.println("Greatest number is: " + a);

//     }
//         else if (b >= a && b >= c){
//             System.out.println("Greatest number is: " + b);
//         }
//         else{
//             System.out.println("Greatest number is: " + c);
//         }
//         sc.close();
//     }
    
// }

import java.util.Scanner;
public class greatest {
   public static void main(String[] args) {
       Scanner sb = new Scanner (System.in);
       System.out.println("Enter three number:");
       int a = sb .nextInt();
       System.out.println("Enter second number:");
       int b = sb .nextInt();
       System.out.println("Enter third number:");
       int c = sb.nextInt();
       if (a>b && a>c) System.out.println(a);
       if (b>a && b>c) System.out.println(b);
       if (c>a && c>b) System.out.println(c);
        sb.close();

    }
}