
import java.util.Scanner;

public class day77 {
    public static void main(String[] args) {
        Scanner rh = new Scanner(System.in);

        // Meminta input nama
        System.out.print("Masukkan nama: ");
        String nama = rh.nextLine();

        System.out.println("\n===== HASIL STRING =====");

        // 1. length()
        System.out.println("Jumlah karakter: " + nama.length());

        // 2. toUpperCase()
        System.out.println("Huruf kapital: " + nama.toUpperCase());

        // 3. toLowerCase()
        System.out.println("Huruf kecil: " + nama.toLowerCase());

        // 4. equals()
        System.out.println("Apakah nama Abdul? " + nama.equals("Abdul"));

        // 5. equalsIgnoreCase()
        System.out.println("Apakah nama abdul? " + nama.equalsIgnoreCase("abdul"));

        // 6. contains()
        System.out.println("Mengandung kata dul? " + nama.contains("dul"));

        // 7. isEmpty()
        System.out.println("Apakah input kosong? " + nama.isEmpty());
        
        // 8. substring()
        System.out.println("Substring: " + nama.substring(0, 3));
        
        // 9. replace()
        System.out.println("Hasil replace: " + nama.replace("a", "o"));

        // 10. trim()
        System.out.println("Setelah trim: " + nama.trim());

        rh.close();
    }
}








