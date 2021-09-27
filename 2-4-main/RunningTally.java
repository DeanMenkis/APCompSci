


import java.util.Scanner;
import java.util.ArrayList;

class RunningTally {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = 0;
        
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        
        System.out.print("Let's add some numbers! [Type a negative number to quit] ");
        
        answer = input.nextInt();
        
        while (answer >= 0 ) {
            System.out.print("Let's add some numbers! [Type a negative number to quit] ");
            arraylist.add(answer);
            answer = input.nextInt();
            
            
        }
        
        int sum = 0;
        for(int i = 0; i < arraylist.size(); i++) {
            sum += arraylist.get(i);
        
            
        }
        System.out.println("Your total is: " + sum);
    }
}
