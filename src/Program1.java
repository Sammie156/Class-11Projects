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
  
}
