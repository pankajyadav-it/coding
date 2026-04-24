import java.util.*;
public class ArraySize1Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many Print Number:");
        int size = sc.nextInt();
        System.out.println("Enter a Number:");
        int numbers [] = new int [size];
        //input
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
            //output
            for(int j = 0; j < size; j++){
                System.out.println("Print Number:" +numbers[i]);
            }
        }
    }
    
}
