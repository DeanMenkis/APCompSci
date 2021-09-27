
import java.util.Scanner;

class Triangle {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What character do you want your triangle to be made of?");
        String chara = input.next();
        
        System.out.print("How tall do you want your bar?");
        
        int x = input.nextInt();
       
        for(int i = 0; i < x; i++ ) {
            
            for(int j = 0; j <= i; j++) {
                System.out.print(chara);
                
            }
            System.out.println();
        }
        
    }
}