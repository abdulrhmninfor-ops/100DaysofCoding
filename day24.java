// menghitung luas persegi panjang 
import java.util.Scanner;
public class day24 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Panjang : ");
        double panjang = input.nextDouble();
        
        System.out.print("Masukan lebar : ");
        double lebar = input.nextDouble();
        
        System.out.println("\n============ hasil ===========");
        System.out.printf("Luas Persegi Panjang \t:%.2f" ,(panjang*lebar), "cm²");

        input.close();
        
    }
    
}
