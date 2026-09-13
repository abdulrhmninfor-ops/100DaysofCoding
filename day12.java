import java.util.Scanner;
public class day12 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukan NIM: ");
        String nim = input.nextLine();
        
        System.out.print("Masukan Alamat: ");
        String alamat = input.nextLine();
        
        System.out.print("Masukan Umur: ");
        int umur = input.nextInt();
        
        System.out.print("Masukan Berat Badan: ");
        double beratBadan = input.nextDouble();
        
        System.out.print("Masukkan tinggi badan: ");
        float tinggiBadan = input.nextFloat();
        
        
        System.out.println("======= Biodata Mahasiswa ======");
        System.out.println("Nama \t\t: " + nama);
        System.out.println("Nim \t\t: " + nim);
        System.out.println("Alamat \t\t: " + alamat);
        System.out.println("Umur \t\t: " + umur);
        System.out.println("Berat Badan \t: " + beratBadan + "kg");
        System.out.println("Tinggi Badan \t: " + tinggiBadan + "cm");
        System.out.println("================================");
        
        
        input.close();
        
        
        
        
        
    }
    
}
