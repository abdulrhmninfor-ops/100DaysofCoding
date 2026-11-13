import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        Scanner dul = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("===== MENU MAKANAN =====");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Mie Ayam");
            System.out.println("3. Bakso");
            System.out.println("4. Es Teh");
            System.out.println("5. Keluar");

            System.out.print("Masukkan pilihan: ");
            pilihan = dul.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih Nasi Goreng");
                    break;

                case 2:
                    System.out.println("Anda memilih Mie Ayam");
                    break;

                case 3:
                    System.out.println("Anda memilih Bakso");
                    break;

                case 4:
                    System.out.println("Anda memilih Es Teh");
                    break;

                case 5:
                    System.out.println("Terima kasih sudah berkunjung!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

            System.out.println();

        } while (pilihan != 5);

        dul.close();
    }
}








                      
