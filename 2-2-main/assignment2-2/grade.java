
import java.util.Scanner;

class grade{

    public static void  main(String[] args){
        //variables
        Scanner sc = new Scanner(System.in);
        String grade;

        System.out.println("Hello! What was your test out of?: ");
        double testT = sc.nextDouble();
        System.out.println("What did you get on your test?: ");
        double testM = sc.nextDouble();

        if(testT == 0) {
            System.out.print("Please re-enter the test total and try again!");
        } else {
            int mark = (int) (100 * testM / testT );

            if (mark >= 100) {
                grade = "A+";
                System.out.print("Great job on the A+!");
                System.out.print(" Your grade is "+mark+"%.");
            } else if (mark <= 99 && mark >= 86) {
                grade = "A";
                System.out.print("Keep up the good work!");
                System.out.print(" Your grade is "+mark+"%.");
            } else if (mark <= 85 && mark >= 73) {
                grade = "B";
                System.out.print("They call this an asian fail.");
                System.out.print(" Your grade is "+mark+"%.");
            } else if (mark <= 72 && mark >= 67) {
                grade = "C+";
                System.out.print("Try and do better, or find somewhere new to live.");
                System.out.print(" Your grade is "+mark+"%.");
            } else if (mark <= 66 && mark >= 60) {
                grade = "C";
                System.out.print("Run.");
                System.out.print(" Your grade is "+mark+"%.");
            } else if (mark <= 59 && mark >= 50) {
                grade = "C-";
                System.out.print("Run faster.");
                System.out.print(" Your grade is "+mark+"%.");
            } else if (mark <= 49 && mark > 0) {
                grade = "F";
                System.out.print(":(");
                System.out.print(" Your grade is "+mark+"%.");
            } else {
                grade = "Invalid grade.";
                System.out.print("Please re-enter your grade and test total.");
            }

            //System.out.print(" Your grade is "+mark+"%.");
        }

        
    }
}
