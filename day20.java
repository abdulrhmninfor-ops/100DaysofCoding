import java.util.Scanner;
public class day20 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Membuat objek Scanner untuk membaca input
        System.out.print("Masukan umur : ");
        int umur = input.nextInt();
        
        System.out.print("Masukan tinggi badan : ");
        double tinggiBadan = input.nextDouble();
        
        
        // Mengubah tipe data int menjadi String
        String teks = String.valueOf(umur);
        String hasil = String.valueOf(tinggiBadan);
        
        
        System.out.println("String umur \t: " + teks + "tahun");
        System.out.println("String tinggi badan \t: " + hasil + "cm");
        
        
        input.close();
        
    }
    
}
