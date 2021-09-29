package BasicPrograms;

import java.util.Scanner;
public class evenorodd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number  ");
        int a = s.nextInt();
        if (a % 2 == 0) {
            System.out.println("Number is even");
        } else
            System.out.println("Number is odd ");
    }

}