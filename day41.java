// latihan menentukan temperatur ruangan menggunakan if
import java.util.Scanner;
public class day41 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Suhu : ");
        int suhu = input.nextInt();
        
        if (suhu < 18 ){
            System.out.println("Suhu : Dingin");
        } else if ( suhu <= 25){
            System.out.println("Suhu : Sejuk");
        } else if ( suhu <= 30){
            System.out.println("Suhu : Hangat ");
        } else {
            System.out.println("Suhu : Panas ");
        }
        input.close();
        
        
    }
    
}
