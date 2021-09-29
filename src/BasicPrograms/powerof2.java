package BasicPrograms;

import java.util.Scanner;

public class powerof2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        int n = 2;
        for (int i = 0; i <= p; i++) {
            if(p>=0 && p<31)
            System.out.println(n+"^"+i+" = "+(int)Math.pow(n,i));
            else
                System.out.println("values overflows int limit");
            break;
        }
    }
}