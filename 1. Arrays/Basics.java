public class Basics {
    public Basics() {
    }

    public static void main(String[] var0) {
        int[] var1 = new int[] { 1, 2, 4, 7, 9 };

        for (int var2 = 0; var2 < var1.length; ++var2) {
            System.out.print(var1[var2] + " ");
        }

        System.out.println();
        int[] var5 = new int[] { 12, 6, 1, 19, 22 };

        for (int var3 = 0; var3 < var5.length; ++var3) {
            System.out.print(var5[var3] + " ");
        }

        System.out.println();
        int[] var6 = new int[4];

        for (int var4 = 0; var4 < var6.length; ++var4) {
            System.out.print(var6[var4] + " ");
        }

    }
}
