import java.util.Scanner;
public class day59 {
    
    public static void main(String[] args) {
        Scanner zy = new Scanner(System.in);
        
        System.out.print("Masukan nilai M: ");
        int M= zy.nextInt();
        System.out.print("Masukan nilai N: ");
        int N = zy.nextInt();
        
        for (int i = 1 ; i<=N; i++){
            if ( i % M == 0){
                System.out.println(i);
            }
        }
        
        zy.close();
        
        
        
    }
    
}
