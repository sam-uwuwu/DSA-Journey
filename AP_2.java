//print this series 99.95,91,87... upto all terms which are positive

package Loops;

public class AP_2 {
    public static void main(String[] args) {
        int  d = 4;
        for (int a=99; a>0; a=a-d){
            System.out.println(a);
        }
    }
}
