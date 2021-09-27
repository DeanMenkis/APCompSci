
import java.util.Scanner;

class magic8ball{
    
    public static void  main(String[] args){
        // var
        Scanner sc = new Scanner(System.in);
        int choice = (int) (Math.random()*20) + 1;
        
        // the stuff
        
        System.out.println("Ask a yes or no question.");
        sc.nextLine();
        
        // some responses taken from en.wikipedia.org/wiki/Magic_8-Ball
        if (choice == 1) {
            System.out.println("Yes.");
        } else if (choice == 1) {
            System.out.println("It is decidedly so.");
        } else if (choice == 2) {
            System.out.println("Most likely.");
        } else if (choice == 3) {
            System.out.println("You'll find out the answer later in life.");
        } else if (choice == 4) {
            System.out.println("It will come to you in a dream.");
        } else if (choice == 5) {
            System.out.println("The answer lies before you.");
        } else if (choice == 6) {
            System.out.println("Without a doubt.");
        } else if (choice == 7) {
            System.out.println("Outlook good. .");
        } else if (choice == 8) {
            System.out.println("Signs point to yes. .");
        } else if (choice == 9) {
            System.out.println("As I see it yes.");
        } else if (choice == 10) {
            System.out.println("Reply hazy, try again .");
        } else if (choice == 11) {
            System.out.println("Ask again later.");
        } else if (choice == 12) {
            System.out.println("Better not tell you now.");
        } else if (choice == 13) {
            System.out.println("Cannot predict now.");
        } else if (choice == 14) {
            System.out.println("Concentrate and ask again.");
        } else if (choice == 15) {
            System.out.println("Don't count on it.");
        } else if (choice == 16) {
            System.out.println("My reply is no.");
        } else if (choice == 17) {
            System.out.println("My sources say no.");
        } else if (choice == 18) {
            System.out.println("Outlook not is so good.");
        } else if (choice == 19) {
            System.out.println("Very doubtful.");
        } else if (choice == 20) {
            System.out.println("No, that is a bad idea.");
        }   
        
    }
}