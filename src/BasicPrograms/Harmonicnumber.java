package BasicPrograms;

import java.util.Scanner;
public class Harmonicnumber {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        float harmonic = 1;
        for (int i = 2; i <= n; i++) {
            harmonic += (float)1 / i;
        }
        System.out.println(harmonic);
}
}
