package BasicPrograms;

import java.util.Scanner;

public class Alphabetvowelorconstant {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char alphabet = s.next().charAt(0);
        if(alphabet =='a'|| alphabet =='e'||alphabet =='i'||alphabet=='o'||alphabet=='u')
            System.out.println("Alphabet Vowel");
        else
            System.out.println("Alphabet is a Consonant");

    }
}
