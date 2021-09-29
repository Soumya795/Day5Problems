package BasicPrograms;

import java.util.Scanner;
public class factors {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int a = 2; a <= n; ++a) {
            {
                int c = a;
                int b = a;
                while (n % a == 0) {
                    if (b == a)
                        System.out.println(a);
                    c = b++;
                    n = n / a;
                }
                    }
        }
    }
}