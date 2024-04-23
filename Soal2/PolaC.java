package Soal2;

public class PolaC {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 6; i++) {
            for (k = 1; k <= 6 - i; k++) {
                System.out.print("  ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
