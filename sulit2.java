
import java.util.Scanner;

public class sulit2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sistem Validasi Angka Negatif Dalam Array");
        System.out.println("Masukkan panjang array yang kamu inginkan :");
        int panjang = input.nextInt();
        int []  angka = new int[panjang];

        for (int i = 0; i < angka.length; i++) {
            System.out.println("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.println("Element Mengandung Negatif: ");
        for (int a = 1; a < angka.length; a++) {
            for (int b = 1; b < angka.length; b++) {
                if (angka[a] < -b) {
                    System.out.println(angka[a]);
                    break;
                }
            }
        }
    }
}