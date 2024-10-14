
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int numofSubjects = sc.nextInt();
        int[] marks = new int[numofSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numofSubjects; i++) {
            System.out.println("Enter the marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        double average = (double) totalMarks / numofSubjects;
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("  *** STUDENT MARKS DETAILS***  ");
        System.out.println("----------------------------------------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + average);
        System.out.println("Grade: " + grade);
    }
}
