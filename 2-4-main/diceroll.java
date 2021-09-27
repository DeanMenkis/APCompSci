import java.util.Scanner;
import java.util.ArrayList;

public class diceroll
{
   public static void main(String[] args) 
   {
       //variables
       Scanner input = new Scanner(System.in);
       
        
       int totalScore = 0;
        
       int n = 0;
       int roll = 0;
        
       boolean play = true;
       
       while(play) 
       {
           ArrayList<Integer> arraylist = new ArrayList<Integer>();
           System.out.print("How many D6's do you want to roll?");
           n = input.nextInt();
           System.out.print("You rolled: ");
           for(int i = 0; i < n; i++) 
           {
               roll = (int) (Math.random()*6) + 1;
               arraylist.add(roll);
               System.out.print(roll + " ");
           }
           System.out.println(" ");
           int sum = 0;
           for(int i = 0; i < arraylist.size(); i++) 
           {
               sum += arraylist.get(i);
           }
           System.out.println("Your total is: " + sum);
           
           System.out.println("Again? [y,n] ");
           
           if (input.next().equals("n")){
               play = false;
            }
       }
       System.out.println("Good-bye!");
    }
}
