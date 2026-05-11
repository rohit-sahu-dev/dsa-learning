public class Mul_by_10 {
    static int[] multiply(int[] arr) {
        int size = arr.length;
        int[] new_arr = new int[size];
        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int new_element = element * 10;
            new_arr[i] = new_element;
        }
        return new_arr;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] ans = multiply(array);
        System.out.print("Printing new array : ");
        for (int x : ans) {
            System.out.print(x+" ");
        }
    }
}