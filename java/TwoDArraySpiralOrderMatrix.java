import java.util.*;
public class TwoDArraySpiralOrderMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Enter Row Number:");
        int n = sc.nextInt();
        System.out.println("How many Enter Columns Number:");
        int m = sc.nextInt();
        System.out.println("Enter row and columns Number:");
        int matrix [][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Spiral Order Matrix is:");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;
        //To print spiral order Matrix
        while(rowStart <= rowEnd && colStart <= colEnd){
        //1
        for(int col = colStart; col <= colEnd; col++){
            System.out.print(matrix[rowStart][col] +" ");
        }
        //2
        rowStart++;
        for(int row = rowStart; row <= rowEnd; row++){
            System.out.print(matrix[row][colEnd] +" ");
        }
        //3
        colEnd--;
        for(int col = colEnd; col >= colStart; col--){
            System.out.print(matrix[rowEnd][col] +" ");
        }
        rowEnd--;
        //4
        for(int row = rowEnd; row >= rowStart; row--){
            System.out.print(matrix[row][colStart] +" ");
        }
            colStart++;
            System.out.println();
        }
    }
  
    
}
