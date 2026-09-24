// menghitung luas persegi panjang 
import java.util.Scanner;
public class day24 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Panjang : ");
        int panjang = input.nextInt();
        
        System.out.print("Masukan lebar : ");
        int lebar = input.nextInt();
        
        System.out.println("\n============ hasil ===========");
        System.out.println("Luas Persegi Panjang \t: " +(panjang*lebar)+ "cm²");
        
        input.close();
        
    }
    
}
