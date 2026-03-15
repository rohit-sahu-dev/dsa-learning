public class Exercise {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 9, 6, 8, 2 };
        print(arr); // print is a method
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1)
                arr[i] *= 2; // odd index elements multiplied by 2
            else
                arr[i] += 10;// even index elements added by 10
        }
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
