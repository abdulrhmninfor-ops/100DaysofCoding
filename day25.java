// menghitung luas lingkaran
//  (L = π × r²).
import java.util.Scanner;
public class day25 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan pi : ");
        double pi = input.nextDouble();
        
        System.out.print("Masukan jari-jari : ");
        int jariJari = input.nextInt();
        
        
        System.out.println("\n============ hasil ===========");
        System.out.println("Luas lingkaran \t: " + (pi*(jariJari*jariJari))+"cm²");
        input.close();
        
        
    }
    
}
