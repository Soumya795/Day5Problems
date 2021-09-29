package FunctionalPrograms;
import java.util.Scanner;
public class Sumofthreeintegers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int range = s.nextInt();
        int arr[] = new int[range];
        System.out.print("How Many Element You Want to Store in Array ? ");
        int n = s.nextInt();
        System.out.print("Enter " + n + " Element to Store in Array : ");
        for(int m=0; m<n; m++) {
            arr[m] = s.nextInt();
        }
        System.out.print("Elements in Array is :\n");
        for(int m=0; m<n; m++) {
            System.out.print(arr[m] + "  ");
        }
        System.out.println("");
        int i,j,k,count=0;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                for(k=j+1;k<n;k++)
                {

                    if (arr[i] + arr[j] + arr[k] == 0)
                    {
                        System.out.println(" ");
                        System.out.println("distinct triplets are " +arr[i] + " " + arr[j] + " " + arr[k] + " = 0");
                        count++;

                    }
                }
            }
        }
        if (count==0) {
            System.out.println("No.of Tripltes found...!");
        }
    }
}

