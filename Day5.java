public class day5 {
    
    public static void main(String[] args) {
        /* double dan float, tipe data pecahan digunakan untuk menyimpan angka 
         * yang memiliki nilai di belakang koma.
         */
        
        
        // double, digunakan untuk menyimpan bilangan pecahan dengan ketelitian lebih tinggi
        double tinggiBadan = 160.5;
        
        /**
         * float digunakan untuk menyimpan bilangan pecahan dengan ketelitian yang lebih rendah.
         * Huruf f diperlukan agar Java mengenali nilai sebagai float
         */
        float suhuTubuh = 35.5f;
        
        // menampilkan tinggi badan dan suhu tubuh
        System.out.println("Tinggi badan \t:" + tinggiBadan + "cm");
        System.out.println("Suhu tubuh \t:" + suhuTubuh + "°C");
        
        // menambahkan cm dan °C untuk menuliskan satuannya 
