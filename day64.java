// latihan membuat bilangan faktoral 
import java.util.Scanner;
public class day64 {
    
    public static void main(String[] args) {
        Scanner zy = new Scanner(System.in);
        
        System.out.print("Masukan nilai N : ");
        int N = zy.nextInt();
        
        int hasil = 1;
        
        for ( int i = N ; i >=  1 ; i--){
            hasil *= i;
        }
        System.out.println("Hasli faktoral : " + hasil);
        zy.close();
        
        
        
    }
    
}
