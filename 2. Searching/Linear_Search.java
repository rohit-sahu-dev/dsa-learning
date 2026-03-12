import java.util.*;

public class Linear_Search {

    public static int LS(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 11, 2, 9, 16, 25 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you want to search : ");
        int key = sc.nextInt();
        int result = LS(arr, key);
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index " + result);
        }

    }

}
