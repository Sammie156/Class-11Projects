import java.util.Scanner;

class Program5{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of square matrix : ");
            int n = sc.nextInt();

            int[][] dda = new int[n][n];

            if(n < 3 || n > 7){
              System.out.println("ERROR! Size of matrix must be between 3 and 7!! ");
            }
            else{
               
              for(int i = 0; i < n; i++){
                    for(int j = 0; j < n; j++){
                          System.out.print("Enter element for row " + (i + 1) +" Column " + (j + 1) + " : ");
                          dda[i][j] = sc.nextInt(); 
                    }
              }

              for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                  System.out.print(dda[i][j] + "   ");
                }
                System.out.println();
              }
            }
            sc.close();
      }
}
