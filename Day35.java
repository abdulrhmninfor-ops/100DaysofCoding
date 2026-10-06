import java.util.Scanner;
public class day35 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan: ");
        int angka = input.nextInt();
        
        if (angka > 0) {
            if (angka % 2 == 0) {
                System.out.println("Positif dan genap");
            } else {System.out.println("Positif dan ganjil");
                
            }
        } else {
            System.out.println("Bukan bilangan positif");
        }
        input.close();
    }
    
    
    
    
    
    
}
