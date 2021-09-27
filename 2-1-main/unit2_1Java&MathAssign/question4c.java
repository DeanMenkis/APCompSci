import java.util.Scanner;

class question4c{ // aka investment banking 101
    
    public static void main(String[] args) {
        //variables
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double r = 0;
        double t = 0;
        double i = 0;
        double m = 0;
        
        
        //input
        System.out.println("Investment Calculator");
        System.out.println("----");
        System.out.println("");
        System.out.print("Enter the investment amount in dollars: $ ");
        a = sc.nextDouble();
        //System.out.print("Enter your yearly contribution: ");
        //m = sc.nextDouble();
        System.out.print("Enter the interest rate (Between 0 and 1): ");
        r = sc.nextDouble();
        System.out.print("Enter how long the investment will sit for(in years): ");
        t = sc.nextDouble();
        
        //interest && display
        i = a * Math.pow(1+r, t); // + (m*t * Math.pow(1+r,t-1));
        double e = i-a;
        System.out.println("This investment would be worth: $ "+i+" ");
        System.out.println("You have earned:$ "+e+" in interest. "); 
    }
    


}
