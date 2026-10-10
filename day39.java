// day 39 membuat kalkulator sederhana menghunakan if
import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== KALKULATOR ===");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.print("Pilih operasi: ");
        int pilih = input.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();

        if (pilih == 1) {
            System.out.println("Hasil = " + (a + b));
        } else if (pilih == 2) {
            System.out.println("Hasil = " + (a - b));
        } else if (pilih == 3) {
            System.out.println("Hasil = " + (a * b));
        } else if (pilih == 4) {
            if (b != 0) {
                System.out.println("Hasil = " + (a / b));
            } else {
                System.out.println("Tidak bisa dibagi nol!");
            }
        } else {
            System.out.println("Pilihan tidak tersedia!");
        }

        input.close();
    }
}
