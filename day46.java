import java.util.Scanner;
public class day46 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("====== MENU MAKANAN ======");
        System.out.println("1. Mie Ayam");
        System.out.println("2. Nasi Goreng");
        System.out.println("3. Ayam Lalapan");
        System.out.println("4. Bakso Urat");
        System.out.println("5. Bakso Komplit");
        
        
        System.out.print("Masukan No Menu : ");
        int menu = input.nextInt();
        
        
        switch (menu){
            case 1:
            System.out.println("Menu  : Mie Ayam");
            System.out.println("Harga : Rp20000");
            break;
            
            case 2:
            System.out.println("Menu  :Nasi Goreng ");
            System.out.println("Harga : Rp15000");
            break;
            
            case 3:
            System.out.println("Menu  : Ayam Lalapan");
            System.out.println("Harga : Rp25000");
            break;
            
            case 4:
            System.out.println("Menu  : Bakso Urat");
            System.out.println("Harga : Rp20000");
            break;
            
            case 5:
            System.out.println("Menu  : Bakso Komplit");
            System.out.println("Harga : Rp23000");
            break;
            
            default:
            System.out.println("Menu tidak tersedia");
            
        }
        input.close();
        
        
        
        
        
        
    }
    
}
