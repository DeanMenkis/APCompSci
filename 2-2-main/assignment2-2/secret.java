import java.util.Scanner;

class secret{
    
    public static void  main(String[] args){
        //variables
        String pass = "hunter2";
        Scanner sc = new Scanner(System.in);
        
        
       
        System.out.print("Enter the password to discover the meaning of life: ");
        String attempt = sc.nextLine();
        
        if (attempt.equals(pass) ) {
            System.out.println("The meaning of life is 42.");
        } else {
            System.out.println("Wrong password. Teriminating program.");
        }
    }
}

