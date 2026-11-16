public class day76 {
    public static void main(String[] args) {

       
        String buah = "   Mangga   ";

        // Menampilkan nama buah asli
        System.out.println("Buah asli: " + buah);

        // Mengambil sebagian teks dari indeks 3 sampai sebelum 7
        System.out.println("Substring: " + buah.substring(3, 7));

        // Mengganti kata Mangga menjadi Jeruk
        System.out.println("Replace: " + buah.replace("Mangga", "Jeruk"));

        // Menghapus spasi di awal dan akhir teks
        System.out.println("Trim: " + buah.trim());

    }
}
