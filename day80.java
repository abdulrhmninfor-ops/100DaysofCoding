import java.util.Scanner;

public class day80 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        // Mengisi array
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan angka: ");
            angka[i] = input.nextInt();
        }

        // Memilih indeks
        System.out.print("Masukkan indeks: ");
        int indeks = input.nextInt();

        // Menampilkan nilai
        System.out.println("Nilai array: " + angka[indeks]);

    }
}
