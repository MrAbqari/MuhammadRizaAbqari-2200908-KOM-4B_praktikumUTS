package Soal1;

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tiga digit integer: ");
        int digit = input.nextInt();

        if (isPalindrome(digit)) {
            System.out.println(digit + " adalah palindrom");
        } else {
            System.out.println(digit + " bukan palindrom");
        }
        input.close();
    }

    public static boolean isPalindrome(int digit) {
        int digit1 = digit / 100;
        int digit3 = digit % 10;

        return digit1 == digit3;
    }
    
}
