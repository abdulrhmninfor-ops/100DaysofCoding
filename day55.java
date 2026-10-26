
import java.util.Scanner;

public class day55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka maksimal: ");
        int a = input.nextInt();

        for (int i = 1; i <= a; i++) {

            if (i == 2) {
                continue;
            }

            if (i == 7) {
                break;
            }

            if (i == 10) {
                return;
            }

            System.out.println(i);
        }

        System.out.println("selesai");

        input.close();
    }
}
