/*
 * program untuk menukar nilai dua variabel
 * adalah program yang digunakan untuk menukar isi dari dua variabel.
 */

import java.util.Scanner;
public class day22 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan nilai pertama :" );
        int nilaiPertama = input.nextInt();
        
        System.out.print("Masukan nilai kedua :" );
        int nilaiKedua = input.nextInt();
        
        
        // Menyimpan nilai pertama sementara
        int nilaiSementara = nilaiPertama;
        
        // Menukar nilai pertama dengan nilai kedua
        nilaiPertama = nilaiKedua;
        
        // Menukar nilai pertama dengan nilai kedua
        nilaiKedua = nilaiSementara;
        
        System.out.println("\n======= Setelah di Tukar =======");
        System.out.println("Nilai Pertama \t: " + nilaiPertama);
        System.out.println("Nilai Kedua   \t: " + nilaiKedua);
        System.out.println("================================");
        
        input.close();
        
        
        
        
        
        
    }
    
}
