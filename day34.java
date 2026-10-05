 * kita ingin mengecek lebih dari satu kondisi.
 */
import java.util.Scanner;
public class day34 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan umur : ");
        int umur = input.nextInt();
        
        
        if (umur < 13){
            System.out.println("Anak-anak");
        } else if (umur < 18) {
            System.out.println("Remaja");
        } else if (umur < 60) {
            System.out.println("Dewasa");
        } else{
             System.out.println("Lansia");
        }
          input.close();
            
        
        
    }
    
   }
