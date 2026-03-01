import java.util.Scanner;

public class Printing_Negative_numbers {
    public static void main(String[] var0) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; ++i) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
