import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" How Many Enter Rows Numbers:");
        int rows = sc.nextInt();
        System.out.println("How Many Enter Columns Number:");
        int cols = sc.nextInt();
        int numbers [][] = new int [rows][cols];
        //input
        //rows
        System.out.println("Enter row and columns Number:");
        for(int i = 0; i < rows; i++){
            //columns
            for(int j = 0; j < cols; j++){
            numbers[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
