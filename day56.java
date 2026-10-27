// 1-N dan N-1 
import java.util.Scanner;
public class day56 {
    
    public static void main(String[] args) {
        Scanner eyz = new Scanner(System.in);
        
        System.out.print("Masukan Nilai N : ");
        int N = eyz.nextInt();
        
        for ( int i=1; i <= N; i++){
            
            System.out.print(i + " ");
            
        }
        
        for ( int i=N; i >= 1; i--){
            System.out.print(i + " " );
            
        }
        
        eyz.close();
        
        
        
        
        
        
    }
    
}
