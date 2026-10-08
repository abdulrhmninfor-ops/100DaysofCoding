// day  37 latihan menentukan bilangan positif negatif dan nol
import java.util.Scanner;
public class day37 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan: ");
        int angka = input.nextInt();
        
        // percabangan if-else if-else.
            if (angka > 0) {
                System.out.println("Bilangan Positif");
            } else if (angka <0){
                System.out.println("Bilangan Negatif");
            } else {
                System.out.println("Bilangan Nol");
        }
        input.close();
    }
        
}
