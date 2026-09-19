/*
 * Konversi otomatis dalam Java adalah perubahan tipe data
 * dari tipe yang lebih kecil ke tipe yang lebih besar secara otomatis
 */
import java.util.Scanner;
public class day18 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Angka :");
        int angka = input.nextInt();
        
        // Konversi otomatis dari int ke double
        double hasil = angka;
        
        System.out.printf("Nilai int \t:%d%n" , angka);
        System.out.printf("Nilai double \t:%.1f " , hasil);
        
        input.close();
    
        
        
        
        
        
    }
    
}
