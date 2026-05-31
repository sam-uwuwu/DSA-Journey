import java.util.Scanner;
public class TSA_of_Cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter length");
        double l = sc.nextDouble();
        System.out.println("Enter Breadth");
        double b = sc.nextDouble();
        System.out.println("Enter Heigt");
        double h = sc.nextDouble();
        double tsa = 2 * (l * b + b * h + h * l);
        System.out.println("Total Surface Area of the Cuboid: " + tsa);
        sc.close();
    }
}
