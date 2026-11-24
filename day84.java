
public class day84 {
    public static void main(String[] args) {

        int[] angka = {10, 25, 7, 40, 15};

        int maksimal = angka[0];

        // Mencari angka terbesar
        for (int i = 0; i < 5; i++) {
            if (angka[i] > maksimal) {
                maksimal = angka[i];
            }
        }

        // Menampilkan isi array
        System.out.println("Isi Array:");

        for (int i = 0; i < 5; i++) {
            System.out.println(angka[i]);
        }

        System.out.println("Angka terbesar adalah: " + maksimal);
    }
}
