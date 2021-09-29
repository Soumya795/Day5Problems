package BasicPrograms;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year");
        int a = s.nextInt();
        if (a >= 1000 && a <= 9999) {
            if ((a % 4 == 0 && a % 100 != 0 )|| a%400==0) {
                        System.out.println(a + " Leap Year");
                    } else {
                        System.out.println(a + " Not a leap year");
                    }


        } else
            System.out.println("Entered year Not a 4 digit number");
    }
}
