// Menentukan bilangan ganjil atau genab
import java.util.Scanner;
public class day36 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Angka : ");
        int angka = input.nextInt();
        
        if (angka %2 == 0){
            System.out.println("Bilangan genap :");
        } else {
            System.out.println("Bilangan ganjil:");
        }
        input.close();
        
        
    }
    
}
