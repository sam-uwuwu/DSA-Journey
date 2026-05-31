//Q1.Write logic to find largest of 3 numbers.
public class Practice1 {
    public static void main(String[] args) {
        int n = 5;
        int largest =0;
        for (int i = 0; i < n; i++) {
            largest = largest * 10 + 9;
        }
        System.out.println("Largest number with " + n + " digits is: " + largest);

    }
}