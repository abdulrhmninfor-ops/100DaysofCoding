// Mengabungkan semua operator 
public class day32 {
    public static void main(String[] args){
        
        int tahunLahir= 2009;
        int tahunSekarang = 2026;
        
        // Operator Aritmatika
        int usia = tahunSekarang-tahunLahir;
        System.out.println("Usia Saat ini \t: " + usia + " Tahun");
        
        // berapa usia satu tahun kedepan dan usia satu tahun sebelumnya 
        usia++; 
        System.out.println("Usia satu tahun ke depan  = " + usia +" Tahun");
        
        usia--;
        System.out.println("Usia satu tahun sebelumnya  = " + usia +" Tahun");
        
        
        int a = 17;
        int b = 18;
        
        System.out.println("apakh a>b \t:" + (a>b));
        System.out.println("memeriksa kesamaan :" + (a==b));
        System.out.println("memeriksa perbedaan :" + (a!=b));
        

        
        
        
    }
}
