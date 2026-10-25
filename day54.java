import java.util.Scanner;
public class day54 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        
        for (int i = 1 ; i <= N; i++){
            if((i %3== 0 || i %4 == 0) &&
                !(i %3== 0 && i %4 == 0)){
                System.out.println(i);
            }
        }
        
        input.close();
        
        
        
        
    }
    
}
