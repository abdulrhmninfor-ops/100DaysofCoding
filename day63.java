// latihan mencetak hasil M pangkat N
import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {

        Scanner zy = new Scanner(System.in);

        System.out.print("Masukkan nilai M: ");
        int M = zy.nextInt();

        System.out.print("Masukkan nilai N: ");
        int N = zy.nextInt();

        int hasil = 1;

        for (int i = 1; i <= N; i++) {
            hasil *= M;
        }

        System.out.println("Hasil = " + hasil);

        zy.close();
    }
}
















