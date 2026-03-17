import java.util.*;

public class Insert_Element {
    public static void main(String[] args) {
        int arr[] = new int[9];
        arr[0] = 2;
        arr[1] = 7;
        arr[2] = 19;
        arr[3] = 7;
        arr[4] = 12;
        arr[5] = 0;
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index at which you want to insert the element : ");
        int n = sc.nextInt();
        int index = n;
        System.out.print("Enter the element you want to insert : ");
        int y = sc.nextInt();
        for (int i = 5; i >= index; i--)
            arr[i + 1] = arr[i];
        arr[index] = y;
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

}
