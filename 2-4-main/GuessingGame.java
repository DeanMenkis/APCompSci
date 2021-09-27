import java.util.Scanner;

public class GuessingGame
{
    public static void main(String[] args) 
    { 
        //variables
        Scanner input = new Scanner(System.in);
        int guess = (int) (Math.random()*100) + 1;
        boolean correct = false;
        int numg = 0;

        while(!correct) 
        {
            System.out.println("What number am I thinking of? ");
            int x = input.nextInt();
            numg++; 
            if(x > guess)
            {
                System.out.println("Too high, try again!");
                
            }
            
            else if(x < guess)
            {
                System.out.println("Too low, try again!");
            }
            
            else
            {
                System.out.println("You've guessed my secret number! ");
                correct = true;
            }
            
        }
        System.out.println("You've guessed my number! Good job! It only took you "+numg+" tries.");
    }
}
