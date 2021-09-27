
import java.util.Scanner;

class Bar {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What character do you want your bar to be made of?");
        String chara = input.next();
        
        System.out.print("How long do you want your bar?");
        int x = input.nextInt();
        for(int i = 0; i < x; i++ ) {
            System.out.print(chara);

        }
        
    }
}
