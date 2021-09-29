package FunctionalPrograms;
import java.util.Scanner;
public class Twodarray {
    public static int array(int x, int y) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter elements :");
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int elements = s.nextInt();
                arr[i][j] = elements;
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nunber of Rows:-");
        int a = sc.nextInt();
        System.out.println("Enter number of Colums:-");
        int b = sc.nextInt();
        int z = array(a, b);

    }
}

