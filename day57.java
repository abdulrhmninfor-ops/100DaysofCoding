
import java.util.Scanner;
public class day57 {
    
    public static void main(String[] args) {
        Scanner eyz = new Scanner(System.in);
        
        System.out.print("Masukan Nilai N : ");
        int N = eyz.nextInt();
        
        
        System.out.print("Angka Genap : ");
        for ( int i=2; i <= N; i+=2) {
            System.out.print(i + " ");
            
        }
        System.out.print("\nAngka Ganjil : ");
        for ( int i=1; i <= N ; i+= 2){
            System.out.print(i + " " );
            
        }
        
        eyz.close();
        
        
        
        
        
        
    }
    
}
