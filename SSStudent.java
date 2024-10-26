public class Student {
    // Attributes
    private String studentName;
    private int quizMarks;
    private int midtermMarks;
    private int finalExamMarks;
    private String studentID;

    // Constructor
    public Student(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.quizMarks = 0; // Default value, if quiz is not attempted
        this.midtermMarks = 0; // Default value, must be updated
        this.finalExamMarks = 0; // Default value, must be updated
    }

    // Setters with validation
    public void setQuizMarks(int quizMarks) {
        if (quizMarks >= 0 && quizMarks <= 100) {
            this.quizMarks = quizMarks;
        } else {
            System.out.println("Invalid quiz marks. Must be between 0 and 100.");
        }
    }

    public void setMidtermMarks(int midtermMarks) {
        if (midtermMarks >= 0 && midtermMarks <= 100) {
            this.midtermMarks = midtermMarks;
        } else {
            System.out.println("Invalid midterm marks. Must be between 0 and 100.");
        }
    }

    public void setFinalExamMarks(int finalExamMarks) {
        if (finalExamMarks >= 0 && finalExamMarks <= 100) {
            this.finalExamMarks = finalExamMarks;
        } else {
            System.out.println("Invalid final exam marks. Must be between 0 and 100.");
        }
    }

    // Getters
    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public int getQuizMarks() {
        return quizMarks;
    }

    public int getMidtermMarks() {
        return midtermMarks;
    }

    public int getFinalExamMarks() {
        return finalExamMarks;
    }

    // Method to calculate average marks out of 20
    public double calculateAverageMarks() {
        return (quizMarks + midtermMarks + finalExamMarks) / 5.0; // Total marks divided by 5
    }

    // Method to calculate total marks out of 100
    public int calculateTotalMarks() {
        return quizMarks + midtermMarks + finalExamMarks;
    }

    // Method to print student details
    public void printStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);

        // If quiz marks are zero, do not print them
        if (quizMarks > 0) {
            System.out.println("Quiz Marks: " + quizMarks);
        }

        // If midterm or final marks are missing (zero), don't print the total
        if (midtermMarks > 0 && finalExamMarks > 0) {
            int totalMarks = calculateTotalMarks();
            System.out.println("Total Marks (out of 100): " + totalMarks);
        } else {
            System.out.println("Midterm or final exam marks missing, total marks cannot be calculated.");
        }

        double averageMarks = calculateAverageMarks();
        System.out.println("Average Marks (out of 20): " + averageMarks);
    }
}
 