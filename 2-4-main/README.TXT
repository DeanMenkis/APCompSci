Exercise 1:

int i = 100;

while(i >=10) {
    i--;
    System.out.println("i is: " + i);
}

Exercise 2:

j +
j + j +
j + j + j + 
j + j + j + j + 
j + j + j + j + j + 
j + j + j + j + j + j + 
j + j + j + j + j + j + j + 
j + j + j + j + j + j + j + j + 
j + j + j + j + j + j + j + j + j + 
j + j + j + j + j + j + j + j + j + j + 

Exercise 3:

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

Exercise 4:

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
            
Exercise 5:


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

Execise 6:

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
                
        


