
import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        int i = 1;

        while (i <= angka) {
            System.out.println(i);
            i++;
        }

        input.close();
    }
}
