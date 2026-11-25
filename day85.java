
public class day85 {
    public static void main(String[] args) {

        int[] angka = {10, 25, 7, 40, 15};

        int minimal = angka[0];

        // Mencari angka terkecil
        for (int i = 0; i < 5; i++) {
            if (angka[i] < minimal) {
                minimal = angka[i];
            }
        }

        // Menampilkan hasil
        System.out.println("Angka terkecil adalah: " + minimal);
    }
}
