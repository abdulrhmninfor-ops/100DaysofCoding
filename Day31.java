// operator logika AND (&&) OR (||) dan NOT (!)
public class day31 {
    
    public static void main(String[] args) {
        
        int nilai = 85;
        boolean kehadiran = true;

        // Operator AND (&&)
        System.out.println("Lulus ujian: " + (nilai >= 80 && kehadiran));

        // Operator OR (||)
        System.out.println("Mendapat nilai tambahan: " + (nilai >= 90 || kehadiran));

        // Operator NOT (!)
        System.out.println("Tidak hadir: " +(!kehadiran));
        
        
    }
    
  }
