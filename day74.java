/*
 * DAY 74, method string dasar (lenght() toupperCase()tolowerCase())
 * Method String adalah fungsi bawaan Java yang 
 * digunakan untuk mengolah atau memanipulasi teks (String). 
 */
import java.util.Scanner;
public class day74 {
    
    public static void main(String[] args) {
        Scanner dul = new Scanner(System.in);
        
        System.out.print("Masukan Nama : ");
        String nama = dul.nextLine();
        
        System.out.println("Nama Asli : " + nama );
        
        // Method length() digunakan untuk menghitung jumlah karakter dalam sebuah teks, termasuk spasi.
        System.out.println("Jumlah Karakter : " + nama.length());
        // Method toUpperCase() digunakan untuk mengubah semua huruf menjadi huruf kapital (besar).
        System.out.println("Huruf Kapital   : " + nama.toUpperCase());
        // Method toLowerCase() digunakan untuk mengubah semua huruf menjadi huruf kecil.
        System.out.println("Huruf Kecil     : " + nama.toLowerCase());
        
        dul.close();
        
        
        
    }
    
}








