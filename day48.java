import java.util.Scanner;
public class day48 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== KALKULATOR ===");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        
        System.out.print("Masukan pilihan operator: ");
        int pilihan= input.nextInt();
        
        
        System.out.print("\nMasukan angka pertama : ");
        int angkaSatu = input.nextInt();
        
        System.out.print("\nMasukan angka kedua : ");
        int angkaDua = input.nextInt();
        
        switch(pilihan){
            case 1:
            System.out.println("Hasil Penjumlahan  : " + (angkaSatu+angkaDua));
            break;
            case 2:
            System.out.println("Hasil Pengurangan  : " + (angkaSatu-angkaDua));
            break;
            case 3:
            System.out.println("Hasil Perkalian : " + (angkaSatu*angkaDua));
            break;
            case 4:
            System.out.println("Hasil Pembagian  : " + (angkaSatu/angkaDua));
            break;
            default:
            System.out.println("operator tidak tersedia");
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
