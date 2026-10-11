import java.util.Scanner;
public class day40 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int paket = input.nextInt();
        int pulsa= input.nextInt();
        
        
        
        if (paket == 1){
            int harga = 10000;
            System.out.println("Paket \t: harian 3GB" );
            System.out.println("Status \t: Berhasil");
            System.out.println("Sisa Pulsa : Rp" + (pulsa-harga));
        }else if (paket == 2){
            int harga = 35000;
             System.out.println("Paket \t: harian 15GB" );
            if (pulsa >= harga) {
                System.out.println("Status : Berhasil");
                System.out.println("Sisa Pulsa : Rp" + (pulsa - harga));
            } else {
                System.out.println("Status : Pulsa tidak cukup");
                System.out.println("Kekurangan : Rp" + (harga - pulsa));
            }
        } else if (paket == 3){
            int harga = 90000;
            System.out.println("Paket \t: harian 15GB" );
            System.out.println("Status \t: Berhasil");
            System.out.println("Sisa Pulsa : Rp" + (pulsa-harga));
        
        } else {
            System.out.println("pilihan tidak valid");
        }
        
            input.close();
            
        
            
            
            
            
    }
    
}
