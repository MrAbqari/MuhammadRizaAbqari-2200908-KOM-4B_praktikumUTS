package Soal2;

public class PolaD {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 6; i++) {
            for (k = 1; k < i; k++) {
                System.out.print("  ");
            }
            for (j = 1; j <= 6 - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
