import java.util.Scanner;

public class day87{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] angka = {5, 10, 20, 25, 30};

        System.out.print("Masukkan indeks: ");
        int indeks = input.nextInt();

        System.out.print("Masukkan angka baru: ");
        angka[indeks] = input.nextInt();

        System.out.print("Hasil perubahan:");

        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i]+", ");
        }

        input.close();
    }
}











