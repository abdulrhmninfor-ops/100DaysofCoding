import java.util.Scanner;

public class day69 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang: ");
        int a = input.nextInt();
        
        System.out.print("Masukkan lebar: ");
        int b = input.nextInt();
        
        
        for (int i = 1; i<= b; i++){
            for (int  c = 1; c<= a; c++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
        
    }
    
}





