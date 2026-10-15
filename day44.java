// Latihan Program predikat Nilia (A,B,C,D)
import java.util.Scanner;
public class day44 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nilai : ");
        int nilai = input.nextInt();
        
        
        if ( nilai >= 90 &&  nilai <= 100){
            System.out.println("Predikat : A");
        } else if ( nilai >= 80 &&  nilai <= 89){
            System.out.println("Predikat : B");
        } else if ( nilai >= 70 && nilai <= 79){
            System.out.println("Predikat : C");
        } else if ( nilai >= 60 && nilai <= 69){
            System.out.println("Predikat : D");
        } else {
            System.out.println("Predikat : E");
        }
        input.close();
        
    }
    
}
