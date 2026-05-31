// Given a point (x, y), write a program to find out if it lies in the 1st Quadrant, 2nd Quadrant, 3rd Quadrant, 4th Quadrant, on the x-axis, y-axis, or at the origin.
import java.util.Scanner;
public class Quadrant {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("X Value:");
              int x = sc.nextInt();
        System.out.println("Y Value");
              int y = sc.nextInt();
              if (x == 0 && y == 0 ){
                System.out.println("Origin");
              }
              else if ( x == 0 ){
                System.out.println("Y axis");
              }
              else if (y == 0){
                System.out.println("X axis");
              }
              else if(x>0 && y>0){
                System.out.println("1st quadrant");
              }
              else if (x<0 && y>0 ){
                System.out.println("2nd Quadrant");
              }
              else if (x<0 && y<0){
                System.out.println("3rd Quadrant");
              }
              else  {
                System.out.println("4th Quadrant");
              }
              sc.close();
        
    }
}
