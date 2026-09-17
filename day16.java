/*
 * operator aritmatika modulus atau sisa bagi (%)
 * adalah operator yang digunakan untuk mencari sisa hasil pembagian.
 */

import java.util.Scanner;
public class day16 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan angka pertma :");
        int angka1 = input.nextInt();
        
        System.out.print("masukan angka kedua :");
        int angka2 = input.nextInt();
        
        // menghitung sisa bagi 
        int hasil = angka1 % angka2;
        
        // menampilkan hasil
        System.out.println("Sisa bagi \t:" + hasil);
        
        input.close();
        
        
        
    }
    
}
