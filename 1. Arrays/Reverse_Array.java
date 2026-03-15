public class Reverse_Array {
    public Reverse_Array() {
    }

    public static void Rev(int[] var0) {
        int var1 = 0;

        for (int var2 = var0.length - 1; var1 < var2; --var2) {
            int var3 = var0[var1];
            var0[var1] = var0[var2];
            var0[var2] = var3;
            ++var1;
        }

    }

    public static void main(String[] var0) {
        int[] var1 = new int[] { 2, 7, 9, 17, 25, 1 };

        for (int var2 = 0; var2 < var1.length; ++var2) {
            System.out.print(var1[var2] + " ");
        }

        System.out.println();
        Rev(var1);

        for (int var3 = 0; var3 < var1.length; ++var3) {
            System.out.print(var1[var3] + " ");
        }

    }
}
