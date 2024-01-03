import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double totalMarks = 0.0; 
        int numberOfSubjects = 0;
        double averagePercentage;
        String studentGrade;

        
        System.out.println("Enter the number of subjects: ");
        numberOfSubjects = scanner.nextInt();

        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.println("Enter marks for subject " + i + ": ");
            double marks = scanner.nextDouble(); 
            totalMarks += marks;
        }

        
        averagePercentage = (totalMarks / numberOfSubjects) * 100;

        
        if (averagePercentage >= 90) {
            studentGrade = "A";
        } else if (averagePercentage >= 80) {
            studentGrade = "B";
        } else if (averagePercentage >= 70) {
            studentGrade = "C";
        } else if (averagePercentage >= 60) {
            studentGrade = "D";
        } else {
            studentGrade = "F";
        }

        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + studentGrade);
    }
}
