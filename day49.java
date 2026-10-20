// Operator ternary 
import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        String hasil = angka >= 0 ? "Positif" : "Negatif";

        System.out.println("Hasil: " + hasil);
    }
}
