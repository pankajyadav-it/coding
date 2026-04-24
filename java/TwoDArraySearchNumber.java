import java.util.*;
public class TwoDArraySearchNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Enter Rows Number:");
        int rows = sc.nextInt();
        System.out.println("How Many Enter Columns Number");
        int cols = sc.nextInt();
        System.out.println("Enter rows and columns Number:");
        int numbers [][] = new int [rows][cols];
        //input
        //rows
        for(int i = 0; i < rows; i++){
            //columns
            for(int j = 0; j < cols; j++){
                numbers [i][j] = sc.nextInt();                
            }
        }
        System.out.println("Enter x found location number:");
        int x = sc.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                //compare with x
                if(numbers[i][j] == x){
                    System.out.println("x found at location("+i+","+j+")");
                }
            }
        }
    }
    
}
