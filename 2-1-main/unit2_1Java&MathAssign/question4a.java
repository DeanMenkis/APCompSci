import java.util.Scanner;

class question4a{
    
    public static void main(String[] args) {
        //variables
        Scanner sc = new Scanner(System.in);
        double r = 0;
        double area = 0;
        
        //input
        //sc.nextDouble();
        //sc.nextInt();
        //sc.nextBoolean();
        //sc.nextLine();
        System.out.println("Circle Radius Calc");
        System.out.println("-----");
        System.out.println("");
        System.out.print("Enter the circle's area: ");
        area = sc.nextDouble();
        
        //calculations && display radius
        r = Math.sqrt (area / Math.PI);
        System.out.println("The circle with area " + area + " units^2 has a radius of "+ r +" units. ");
        
    }
    


}