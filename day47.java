// day 47 program untuk menentukan hari
import java.util.Scanner;
public class day47 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan nomor hari : ");
        int hari = input.nextInt();
        
        switch ( hari ){
            case 1: 
            System.out.println("Hari Senin");
            break ;
            
            case 2: 
            System.out.println("Hari Selasa");
            break ;
            
            case 3: 
            System.out.println("Hari Rabu");
            break ;
            
            case 4: 
            System.out.println("Hari Kamis");
            break ;
            
            case 5: 
            System.out.println("Hari Jumat");
            break ;
            
            case 6: 
            System.out.println("Hari Saptu");
            break ;
            
            case 7: 
            System.out.println("Hari Minggu");
            break ;
            
            default:
            System.out.println("hari tidak tersedia ");
            
            
        }
        
        input.close();
        
        
        
    }
    
}
