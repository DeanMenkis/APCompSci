import java.util.Scanner;

public class rockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        final int ROCK = 1;
        final int PAPER = 2;
        final int SCISSORS = 3;
        int win = 0;
        int loss = 0;
        int tie = 0;
        System.out.println("RPS 1.0");
        System.out.println("*********************************************************");
        boolean playAgain = true;
        while(playAgain)
        {
            int computerChoice = (int) (Math.random()*3) + 1;
            System.out.println("Good luck, human ...");
            System.out.print("What do you throw? [1] Rock, [2] Paper, [3] Scissors?");
            int choice = input.nextInt();
            

            if(choice == ROCK && computerChoice == SCISSORS)      //WIN
            {
                System.out.println("You threw rock! I threw scissors!");
                System.out.println("Whaaa?? ... You beat me? RAGE!");
                win += 1;

                play();
                if (input.next().equals("n"))
                {
                    playAgain = false;
                    System.out.println("Good Game! Thanks for playing.");
                }
            }
            else if(choice == ROCK && computerChoice == PAPER) // LOSS
            {
                System.out.println("You threw rock! I threw paper!");
                System.out.println("I win! You are not a challenge for me ...");
                loss += 1;

                play();
                if (input.next().equals("n"))
                {
                    playAgain = false;
                    System.out.println("Good Game! Thanks for playing.");
                }
            }
            else if(choice == ROCK && computerChoice == ROCK) //TIE
            {
                System.out.println("You threw rock! I threw rock!");
                System.out.println("A draw ... pretty good, human! I demand a rematch ...");
                tie += 1;

                play();
                if (input.next().equals("n"))
                {
                    playAgain = false;
                    System.out.println("Good Game! Thanks for playing.");
                }
            } 
            else if(choice == PAPER && computerChoice == ROCK)    // WIN
            {
                System.out.println("You threw paper! I threw rock!");
                System.out.println("Whaaa?? ... You beat me? RAGE!");
                win += 1;

                play();
                if (input.next().equals("n"))
                {
                    playAgain = false;
                    System.out.println("Good Game! Thanks for playing.");
                }

            }
            else if(choice == PAPER && computerChoice == SCISSORS)    // LOSS
            {
                System.out.println("You threw paper! I threw scissors!");
                System.out.println("I win! You are not a challenge for me ...");
                loss += 1;

                play();
                if (input.next().equals("n"))
                {
                    playAgain = false;
                    System.out.println("Good Game! Thanks for playing.");
                }

            }
            else if(choice == PAPER && computerChoice == PAPER)    // TIE
            {
                System.out.println("You threw paper! I thew paper!");
                System.out.println("A draw ... pretty good, human! I demand a rematch ...");
                tie += 1;

                play();
                if (input.next().equals("n"))
                {
                    playAgain = false;
                    System.out.println("Good Game! Thanks for playing.");
                }

            }
            else if(choice == SCISSORS && computerChoice == PAPER)     //WIN
            {
                System.out.println("You threw scissors! I threw paper!");
                System.out.println("Whaaa?? ... You beat me? RAGE!");
                win += 1;

                play();
                if (input.next().equals("n"))
                {
                    playAgain = false;
                    System.out.println("Good Game! Thanks for playing.");
                }

            }
            else if(choice == SCISSORS && computerChoice == ROCK)     // LOSS
            {
                System.out.println("You threw scissors! I threw rock!");
                System.out.println("I win! You are not a challenge for me ...");
                loss += 1;

                play();
                if (input.next().equals("n"))
                {
                    playAgain = false;
                    System.out.println("Good Game! Thanks for playing.");
                }

            }
            else if(choice == SCISSORS && computerChoice == SCISSORS)         // TIE
            {
                System.out.println("You threw scissors! I threw scissors!");
                System.out.println("A draw ... pretty good, human! I demand a rematch ...");
                tie += 1;

                play();
                if (input.next().equals("n"))
                {
                    playAgain = false;
                    System.out.println("Good Game! Thanks for playing.");
                }

            }         
            else
            {
                System.out.println("Invalid response. To err is human.");
                System.out.print("What do you throw? [1] Rock, [2] Paper, [3] Scissors?");
            }

        }
        System.out.println("*********************************************************");
        System.out.println("Wins: " +  win);
        System.out.println("Losses: " + loss);
        System.out.println("Ties: " + tie);
    }

    public static void play()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Again? [y,n] ");
    }

}

