
import java.util.Scanner;

public class day75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan nama
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        // Mengecek apakah nama sama persis dengan Abdul
        System.out.println("Apakah nama Abdul? " + nama.equals("Abdul"));

        // Mengecek nama tanpa membedakan huruf besar dan kecil
        System.out.println("Apakah nama abdul? " + nama.equalsIgnoreCase("abdul"));

        // Mengecek apakah nama mengandung kata dul
        System.out.println("Apakah nama mengandung dul? " + nama.contains("dul"));

        // Mengecek apakah nama kosong atau tidak
        System.out.println("Apakah nama kosong? " + nama.isEmpty());

        
        input.close();
    }
}












