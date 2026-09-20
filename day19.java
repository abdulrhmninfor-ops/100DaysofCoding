import java.util.Scanner;
public class day19 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan angka desimal: ");
        double angkaBesar = input.nextDouble();  
        
        int angkaKecil = (int) angkaBesar;
        
        System.out.println("==================================");
        System.out.println("\t Day 19");
        System.out.println("==================================");
        System.out.printf("Nilai Double \t:%.2f" , angkaBesar);
        System.out.printf("%nNilai int \t:%d" , angkaKecil);
        System.out.println("\n==================================");
        
        
        input.close();
        
        
    }
    
}
