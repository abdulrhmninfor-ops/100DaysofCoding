import java.util.Scanner;

public class day83 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] angka = new int[3];
        int jumlah = 0;

        // Mengisi array
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            angka[i] = input.nextInt();
        }

        // Menjumlahkan seluruh elemen array
        for (int i = 0; i < 3; i++) {
            jumlah += angka[i];
        }

        System.out.println("hasil di jumlahkan : " + jumlah);

        input.close();
    }
}















