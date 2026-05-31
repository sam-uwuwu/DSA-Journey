// Take length and breadth of rectangle A INPUT and write  PROGRAM to find whether the area of rectangle is greatyer than its perimeter
import java.util.Scanner;
public class AreaPerimetercompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter length of the rectangle:");
        int length =sc.nextInt();
        System.out.println("Enter breadth of the rectangle:");
        int breadth = sc.nextInt();
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        if (area > perimeter ){
            System.out.println("Area is greater than perimeter");
        }
        else {
            System.out.println("Perimeter is smaller than the area");
        }
        sc.close();

    }
}
