import java.util.Scanner;

public class SStudent {

    int numbOfStud;
    double totalMarks, average;
    double maths, science, history, english, art; 

    public void numberOfS() {
        Scanner sc = new Scanner(System.in);

    
        System.out.println("Enter the number of students:");
        numbOfStud = sc.nextInt();

    
        for (int i = 1; i <= numbOfStud; i++) {
            System.out.println("Enter the marks for student " + i);

            
            System.out.println("Enter Maths marks (out of 20):");
            maths = sc.nextDouble();
            while (maths > 20 || maths < 0) {
                System.out.println("Invalid input, please enter Maths marks between 0 and 20.");
                maths = sc.nextDouble(); 
            }

            
            System.out.println("Enter Science marks (out of 20):");
            science = sc.nextDouble();
            while (science > 20 || science < 0) {
                System.out.println("Invalid input, please enter Science marks between 0 and 20.");
                science = sc.nextDouble(); 
            }

            
            System.out.println("Enter History marks (out of 20):");
            history = sc.nextDouble();
            while (history > 20 || history < 0) {
                System.out.println("Invalid input, please enter History marks between 0 and 20.");
                history = sc.nextDouble(); 
            }

            
            System.out.println("Enter English marks (out of 20):");
            english = sc.nextDouble();
            while (english > 20 || english < 0) {
                System.out.println("Invalid input, please enter English marks between 0 and 20.");
                english = sc.nextDouble(); 
            }

            
            System.out.println("Enter Art marks (out of 20):");
            art = sc.nextDouble();


            while (art > 20 || art < 0) {
                System.out.println("Invalid input, please enter Art marks between 0 and 20.");
                art = sc.nextDouble(); 
            }

            
            totalMarks = maths + science + history + english + art;


            average = totalMarks / 5;

            
            System.out.println("Total Marks for student " + i + ": " + totalMarks);
            System.out.println("Average Marks for student " + i + ": " + average);
        }
        sc.close();
    }

    public static void main(String[] args) {
        SStudent student = new SStudent();
        student.numberOfS();
    }
}
