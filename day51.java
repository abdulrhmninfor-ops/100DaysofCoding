// perulangan for
import java.util.Scanner;
public class day51 {
    
    public static void main(String[] args) {
        Scanner dul = new Scanner(System.in);
        
        System.out.print("Masukan angka : ");
        int angka = dul.nextInt();
        
        // Perulangan dari 1 sampai angka
        for (int i = 1; i <= angka; i++){
            System.out.println(i);
        }
        dul.close();
        
        
        
        
    }
    
}
