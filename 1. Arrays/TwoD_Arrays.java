public class TwoD_Arrays {
    public static void main(String[] args) {
        int A[][] = { { 1, 2, 3 }, { 7, 8, 9 }, { 4, 5, 6 } };
        for (int i = 0; i < A.length; i++) { // rows
            for (int j = 0; j < A[i].length; j++) { // columns
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

    }

}
