// operator penugasan sama dengan, + =, kurang sama dengan, dan lain-lain
public class day17 {
    
    public static void main(String[] args) {
        
        
        // memberi nilai
        int angka = 20;
        System.out.println("nilai awal \t\t: " + angka);
        
        angka += 10;
        System.out.println("Hasil Penjumlahan \t: " + angka);
        
        angka -= 5;
        System.out.println("Hasil Pengurangan \t: " + angka);
        
        angka *= 3;
        System.out.println("Hasil Perkalian \t: " +angka);
        
        angka /= 2;
        System.out.println("Hasil Pembagian \t: " +angka);
        
        angka %= 7;
        System.out.println("Sisa Bagi \t\t: " +angka);
        
    }
    
}
