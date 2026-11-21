
import java.util.Scanner;

public class day81 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        // Mengisi array
        System.out.println("=== Mengisi Array ===");

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            angka[i] = input.nextInt();
        }

        // Menampilkan array
        System.out.println("\n=== Isi Array ===");

        for (int i = 0; i < 5; i++) {
            System.out.println("Angka ke-" + (i + 1) + " : " + angka[i]);
        }

        input.close();
    }
}
