import java.util.Scanner;

public class day62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
