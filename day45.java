import java.util.Scanner;
public class day45 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan No Jurusan : ");
        int jurusan = input.nextInt();
        
        switch (jurusan){
            case 1:
            System.out.println("1. informatika");
            break;
            
            case 2:
            System.out.println("2. Sistem informasi");
            break;
            
            case 3:
            System.out.println("3. Teknik Elektro");
            break;
            
            case 4:
            System.out.println("4. Teknik Sipil");
            break;
            
            default:
            System.out.println("Jurisan tidak tersedia ");
            
        }
        
        input.close();
        
        
    }
    
}
