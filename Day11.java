import java.util.Scanner;
public class Day11 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Masukan Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukan Umur: ");
        int umur = input.nextInt();
        
        System.out.print("Masukan Berat Badan: ");
        double beratBadan = input.nextDouble();
        
        System.out.print("Masukkan tinggi badan: ");
        float tinggiBadan = input.nextFloat();
        
        System.out.print("Masukkan golongan darah (A/B/O): ");
        char golonganDarah = input.next().charAt(0);
        
        System.out.print("Masukan nomor HP: ");
        long nomorHp = input.nextLong();
        
        System.out.print("Masukan Jumlah kursi: ");
        short jumlahKursi = input.nextShort();
        
        System.out.print("Masukan Jumlah Pensil: ");
        byte jumlahPensil = input.nextByte();
        
        System.out.print("Masih mahasiswa? (true/false): ");
        boolean masihMahasiswa = input.nextBoolean();
        
        System.out.println("\n========DAY11========");
        System.out.println("Nama \t\t: " + nama);
        System.out.println("Umur \t\t: " + umur);
        System.out.println("Berat Badan \t: " + beratBadan + "kg");
        System.out.println("Tinggi Badan \t: " + tinggiBadan + "cm");
        System.out.println("golongan darah \t: " + golonganDarah +"+");
        System.out.println("Nomor Hp \t: " + nomorHp);
        System.out.println("Jumlah Kursi \t: " + jumlahKursi);
        System.out.println("Jumlah Pensil \t: " + jumlahPensil);
        System.out.println("Masih mahasiswa : " + masihMahasiswa);
        
        input.close();
        
        
        
        
    }
    
}
