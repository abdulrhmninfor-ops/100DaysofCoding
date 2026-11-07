import java.util.Scanner;

public class day67 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("masukan nilai : ");
        int a = input.nextInt();
        
        
        for (int i = 1; i <= a; i++){
            for (int b = 1; b <= a; b++){
                
                if (i == 1 || i == a || b == 1 || b == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            
            System.out.println();
            
            
            
        }
        
        input.close();
        
        
        
        
    }
    
}
