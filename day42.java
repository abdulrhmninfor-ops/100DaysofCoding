// latihan menentukan gaji bersih 
import java.util.Scanner;
public class day42 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Gaji : ");
        double gaji = input.nextDouble();
        
        
        double  pajak;
        
        if (gaji > 5000000){
            pajak = gaji*0.1;
        } else {
            pajak = gaji*0.05;
        }
        
        int potongan = 300000;
        double gajiBersih = gaji - pajak - potongan;
        
        System.out.println("Gaji Pokok \t: Rp" + gaji);     
        System.out.println("Pajak \t\t: Rp" + pajak);
        System.out.println("Potongan \t: Rp" + potongan);
        System.out.println("Gaji Betrih \t: Rp" + gajiBersih);
        
        
        input.close();
        
        
        
    }
    
  }
