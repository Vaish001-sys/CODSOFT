import java.util.Scanner;

public class StudentReport {

 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 // Write down the number of subjects
 System.out.print("Enter the number of subjects: ");
 int numSubjects = scanner.nextInt();

 // Individually write the marks for each subjects
 float[] marks = new float[numSubjects];
 float totalMarks = 0;

 for (int i = 0; i < numSubjects; i++) {
 // i+1 since array index starts from 0 n will show subject 0 which is quite confusing
 System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
 marks[i] = scanner.nextFloat();
 totalMarks += marks[i];
 }

 // let us now Calculate average percentage
 float average = totalMarks / numSubjects;

 // the grading system
 String grade;
 if (average >= 80) {
 grade = "A+";
 } else if (average >= 70) {
 grade = "A";
 } else if (average >= 60) {
 grade = "B";
 } else if (average >= 50) {
 grade = "C";
 } else if (average >= 33) {
 grade = "D";
 } else {
 grade = "F for fail dude";
 }

 // this would be the result of a student x hope he/she doesn't fail
 System.out.println("Student Report\n");
 System.out.printf("Total Marks: %.2f\n", totalMarks);
 System.out.printf("Average Percentage: %.2f%%\n", average);
 System.out.println("Grade: " + grade);

 scanner.close();
 }
}
