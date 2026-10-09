
// day 38 latiahan membuat menu menggunakan if
import java.util.Scanner;

public class day38 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU KOPI===");
        System.out.println("1. Americano ");
        System.out.println("2. Cappuccino");
        System.out.println("3. Espresso");
        System.out.println("4. Mochaccino");

        System.out.print("Pilih menu (1-4): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih Americano ");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih Cappucino");
        } else if (pilihan == 3) {
            System.out.println("Anda memilih Espreso");
        } else if ( pilihan == 4){
            System.out.println("Anda memilih Mochaccino");
        } else {
            System.out.println("pilihan tidak falid");
        }
        
        
        
        
        input.close();
    }
}
