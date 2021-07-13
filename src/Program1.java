import java.io.*;

class Program1 {
  public static void main(String[] args) throws IOException {
    // Using DataInputStream for handling input from the user.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter your name : ");
    String name = br.readLine();

    System.out.println(name);
  }
}
