
import java.util.Scanner;

class question4b{
    
    public static void main(String[] args) {
        //variables
        Scanner sc = new Scanner(System.in);
        double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        double dist = 0;
        
        //input
        //sc.nextDouble();
        //sc.nextInt();
        //sc.nextBoolean();
        //sc.nextLine();
        System.out.println("Distance Calc");
        System.out.println("-----");
        System.out.println("");
        System.out.print("Enter the X coordinate of point 1: ");
        x1 = sc.nextDouble();
        System.out.print("Enter the y coordinate of point 1: ");
        y1 = sc.nextDouble();
        System.out.print("Enter the X coordinate of point 2: ");
        x2 = sc.nextDouble();
        System.out.print("Enter the X coordinate of point 2: ");
        y2 = sc.nextDouble();
        
        
        
        //calculations && display radius
        dist = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1) *(y2 - y1));
        System.out.println("The distance between those two points is " + dist + " ");
        
    }
    


}