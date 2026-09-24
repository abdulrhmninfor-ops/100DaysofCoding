import java.util.Scanner;
public class day23 {
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan Sisi persegi : ");
        int sisi = input.nextInt();
        
        
        
        System.out.println("\n=== Menghitung Luas Persegi ===");
        System.out.println("Luas Persegi \t: " +(sisi*sisi)+ "cm²");
        
        input.close();
        
    }
    
}
