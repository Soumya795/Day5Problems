package BasicPrograms;

import java.util.Scanner;

public class quotientandremainder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
int divident = s.nextInt();
int divisor = s.nextInt();
int q=(divident/divisor);
int r= divident%divisor;
        System.out.println("Quotient = "+q);
        System.out.println("Remainder = "+r);
    }
}
