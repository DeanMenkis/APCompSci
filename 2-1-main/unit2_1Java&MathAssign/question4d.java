
import java.util.Scanner;

class question4d{ // aka yahtzee
    
    public static void main(String[] args) {
        //variables
        int roll0 = 0;
        int roll1 = 0;
        int roll2 = 0;
        int roll3 = 0;
        int roll4 = 0;
        int roll5 = 0;
        int roll6 = 0;
        int roll7 = 0;
        int roll8 = 0;
        int roll9 = 0;
        
        int totalScore = 0;
        
        roll0 = (int) (Math.random()*6) + 1;
        System.out.println("Die roll 1; " + roll0);
        roll1 = (int) (Math.random()*6) + 1;
        System.out.println("Die roll 2; " + roll1);
        roll2 = (int) (Math.random()*6) + 1;
        System.out.println("Die roll 3; " + roll2);
        roll3 = (int) (Math.random()*6) + 1;
        System.out.println("Die roll 4; " + roll3);
        roll4 = (int) (Math.random()*6) + 1;
        System.out.println("Die roll 5; " + roll4);
        roll5 = (int) (Math.random()*6) + 1;
        System.out.println("Die roll 6; " + roll5);
        roll6 = (int) (Math.random()*6) + 1;
        System.out.println("Die roll 7; " + roll6);
        roll7 = (int) (Math.random()*6) + 1;
        System.out.println("Die roll 8; " + roll7);
        roll8 = (int) (Math.random()*6) + 1;
        System.out.println("Die roll 9; " + roll8);
        roll9 = (int) (Math.random()*6) + 1;
        System.out.println("Die roll 10; " + roll9);
        
        totalScore = roll0 + roll1 + roll2 + roll3 + roll4 + roll5 + roll6 + roll7 +roll8 +roll9;
        System.out.println("Your total was: " + totalScore);
        if(totalScore > 35) {
            System.out.println("You scored higher than the average!");
        }
    }
    


}