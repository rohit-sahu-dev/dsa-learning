import java.util.Arrays;

public class DeepAndShallow {

    public static void main(String[] args) {
        int[] arr = { 1, 7, 34, 6, 0 };
        int[] x = arr; // x is a shallow copy of arr
        x[2] = 10;
        System.out.println(arr[2]);

        int[] y = Arrays.copyOf(arr, arr.length); // ys is a deep copy of arr
        y[0] = 8;
        System.out.println(arr[0]);
    }

}
