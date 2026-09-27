// soal 1
/*
 * Buatlah program yang meminta masukan berupa data mahasiswa 
 * dan cetak hasil inputan dengan format yang rapi.
 */
import java.util.Scanner;
public class day26 {
    
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        
        System.out.print("Masukan nama : ");
        String nama = input.nextLine();
        
        System.out.print("Masukan NIM : ");
        String nim = input.nextLine();
        
        System.out.print("Masukan kelas : ");
        char kelas = input.next().charAt(0);
        
        System.out.print("Masukan Umur : ");
        int umur = input.nextInt();
        
        System.out.print("Masukan prodi : ");
        String prodi = input.nextLine();
        
        System.out.print("Masukan IPK : ");
        double ipk = input.nextDouble();
        
        System.out.print("Masukan Status Keaktifan : ");
        boolean satatusAktif = input.nextBoolean();
        
        
        
        System.out.println("Nama \t: " + nama);
        System.out.println("NIM \t: " + nim);
        System.out.println("Kelas \t: " + kelas);
        System.out.println("Umur \t: " + umur);
        System.out.println("Prodi \t: " + prodi);
        System.out.printf("%nIPK \t:%.2f" , ipk);
        System.out.println("Status Aktif \t: "+ satatusAktif);
        
 // soal 2
        /*
         * Buatlah program yang menghitung luas lingkaran berdasarkan
         * input jari-jari menggunakan nilai konstanta PI.
         * Rumus Luas Lingkaran: PI × jari × jari
         */




Nilai PI = 3.14
        
        int a = input.nextInt();
        double b = input.nextDouble();
        
        double rumus = b*(a*a);
        
        System.out.println(rumus);
        
  // soal 3
        /*
         * Buatlah program untuk menukar nilai berupa bilangan bulat
         * pada dua variabel berbeda, tanpa menggunakan variabel tambahan/tampungan.
         */
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        
        int sementara = a;
         a = b;
         b = sementara;
        
        System.out.println(a);
        System.out.println(b);
        
        
        input.next();
        
    }
    
          }
