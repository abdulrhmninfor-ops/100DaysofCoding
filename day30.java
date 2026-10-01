// Day30, operator perbandingan <=dan >=
import java.util.Scanner;
public class day30 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();
        
        // <= Kurang dari atau sama dengan
        System.out.println("Apakah nilai a <= nilai b? "+ (a <= b));
        // >= lebih dari sama dengan
        System.out.println("Apakah nilai a >= nilai b? " + (a >= b));

        input.close();
    
        
        
        
        
    }
    
          }
