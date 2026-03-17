public class Right_rotated {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 9, 10, 31, 7 };
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

}
