package Loops;

public class Comtinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if (i == 2) {
                continue; // Skip the rest of the loop when i is 2
            }
            System.out.println(i);
        }
    }
    
}
