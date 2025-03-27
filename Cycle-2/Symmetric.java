import java.util.Scanner;
public class Symmetric{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows/columns (square matrix): ");     
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter elements of the matrix:");    
        for (int i = 0; i < n; i++) {               //loop for inputing the matrix
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
       int flag=0;                                      //loop to check if symmetric
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    flag=1;
                    break;
                }
            }
        }
        System.out.println("The entered matrix is:");       //printing the entered matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");       
            }
            System.out.println(); 
        }
        if (flag==0) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
}
