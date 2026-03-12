public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 7, 9, 8 };
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
    }

    public static void change(int[] y) {
        y[2] = 9;
    }

}
