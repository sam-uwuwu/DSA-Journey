// if cost price  and sellinf price of an item is input through the key board wite a program to determine whether the seller has made profitor incured loss or no profit no loss. Also determin how much profit he made or loss he incurred
import java.util.Scanner;
public class CostSellingPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price:");
        Double CostPrice = sc.nextDouble();
        System.out.println("Enter the sellng Price:");
        Double SellingPrice = sc.nextDouble();
        if (SellingPrice > CostPrice ){
            Double Profit = SellingPrice - CostPrice;
            System.out.println("The seller has made a profit of :" + Profit);
        } else if (CostPrice < SellingPrice){
            Double Loss = CostPrice - SellingPrice;
            System.out.println("The Seller made a loss of :" + Loss + "Rs");
        } else{
            System.out.println("No Profit No Loss");
        }
        sc.close();
    }
}
