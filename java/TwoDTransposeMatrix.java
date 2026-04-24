import java.util.*;
public class TwoDTransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Enter row Number:");
        int n = sc.nextInt();
        System.out.println("How many Enter column Number:");
        int m = sc.nextInt();
        System.out.println("Enter Row and Coulmns Number:");
        int matrix [][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The transpose is:");
        //condition for transpose
        for(int j = 0; j < m; j++){
            for(int i = 0; i < n; i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
