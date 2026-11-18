import java.util.Scanner;
public class day78 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("===== BUAT AKUN =====");
        
        System.out.print("Buat Username : ");
        String username = input.next();
        
        System.out.print("Buat Pasword : ");
        String pasword= input.next();
        
        System.out.println("\n===== BUAT AKUN =====");     
        
        String user;
        String pas;
        
        
        do {
            System.out.print("Masukan Username : "  );
            user = input.next();
            System.out.print("Masukan Pasword : ");
            pas = input.next();
            
            if (!user.equals(username) || !pas.equals(pasword)){
                System.out.println("Username atau pasword salah!");   
                System.out.println("Silakan coba lagi.\n");
            }
         
        } while (!user.equals(username) || !pas.equals(pasword));

        System.out.println("\nLogin berhasil!");
        System.out.println("Selamat datang, " + username);

        input.close();

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
















