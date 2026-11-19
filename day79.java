import java.util.Scanner;
public class day79 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("===Masukan data arry===");
        int [] angka = new int [6];
        
        for (int i = 0; i < 6; i++){
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            angka [i] = input.nextInt();
            
        }
        System.out.println("\n===== HASIL ARRAY =====");
        for (int i = 0; i < 6; i++) {
            System.out.println("Angka ke-" + (i + 1) + " : " + angka[i]);
        }
        
        
        
        
        
        
        
    }
    
}
