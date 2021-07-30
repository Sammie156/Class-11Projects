
/*Write a program in JAVA to enter roll, name and marks of 5 subjects. Calculate total, average and grade. Display the output in the following format.
Roll  Name 	Marks-1    Marks-2     Marks-3     Marks-4     Marks-5    Total   Average   Grade  TOTAL  AVG 

The program should work for n number of students and marks to be stored using 2D array concept. Grade are as follows :
Marks 					Grade 
>=90					      A
>=80 & <90				  B
>=70 & <80				  C
>=60 & <70 				  D
<60						      E
*/
import java.io.*;

class Program1 {
  public static void main(String[] args) throws IOException {
    // Using DataInputStream for handling input from the user.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Integer to hold Number of students
    int n = 0;

    System.out.println("Enter number of students : ");
    n = Integer.parseInt(br.readLine());

    int rows = n; // Number of rows of the DDA
    int columns = 5; // Number of columns of the DDA

    int[][] marks = new int[rows][columns]; // Creating the DDA for storing the marks of 'n' number of students.
    String[] names = new String[n]; // Creating a Single-Dimension Array to hold the names of the students.
    char[] grade = new char[n]; // A Single-Dimensional Array to hold the grade of the students.
    double[] total = new double[n]; // A Single-Dimensional Array to hold the total of the students.
    double[] average = new double[n]; // A Single Dimensional Array to hold the average of each student

    // Accepting the name of each student and storing them in the names[] array.
    for (int i = 0; i < rows; i++) {
      System.out.println("Enter name of student : " + (i + 1) + " : ");
      names[i] = br.readLine();
    }

    // Accepting marks of each student for each subject and storing them in the
    // marks[][] array.
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.println("Enter Marks of Subject : " + (j + 1) + " of " + names[i] + " : ");
        marks[i][j] = Integer.parseInt(br.readLine());
        total[i] += marks[i][j];
      }
    }
    for (int i = 0; i < rows; i++) {
      average[i] = total[i] / 5.0; // Calculating the average of each student.

      // Assigning grade for each student based on their on average score.
      if (average[i] >= 90.0) {
        grade[i] = 'A';
      } else if (average[i] >= 80 && average[i] < 90) {
        grade[i] = 'B';
      } else if (average[i] >= 70 && average[i] < 80) {
        grade[i] = 'C';
      } else if (average[i] >= 60 && average[i] < 70) {
        grade[i] = 'D';
      } else {
        grade[i] = 'E';
      }
    }

    System.out.println("Roll No. Name Marks-1 Marks-2 Marks-3 Marks-4  Marks-5  Total  Average  Grade");

    for (int i = 0; i < rows; i++) {
      System.out.print((i + 1) + "\t " + names[i] + "\t ");
      for (int j = 0; j < columns; j++) {
        System.out.print(marks[i][j] + "\t ");
      }
      System.out.println(total[i] + "\t " + average[i] + "\t " + grade[i]);
    }
  }
}
