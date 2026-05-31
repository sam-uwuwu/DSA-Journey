public class Practice4 {
    public static void main(String[] args) {
        int n = 5;
        long result = 1;
        if (n == 0){
            result = 1;
        }
        else if (n > 0){
            for ( int i = 1; i <= n; i++)
            result = result * i;
        }
        else{
            System.out.println("It's a wrong input");
        }
        System.out.println("Factorial of the number is : " + result);
    }
}
