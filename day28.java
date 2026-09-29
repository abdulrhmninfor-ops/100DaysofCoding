import java.util.Scanner;

public class day28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan A: ");
        int bilanganA = input.nextInt();

        System.out.print("Masukkan bilangan B: ");
        int bilanganB = input.nextInt();

        System.out.println("Hasil pemeriksaan kesamaan: "+ (bilanganA == bilanganB));

        System.out.println("Hasil pemeriksaan perbedaan: "+ (bilanganA != bilanganB));

        input.close();
    }
}
