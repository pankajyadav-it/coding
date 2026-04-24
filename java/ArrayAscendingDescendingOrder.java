import java.util.*;
public class ArrayAscendingDescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many Numbers:");
        int size = sc.nextInt();
        System.out.println("Enter The Numbers:");
        int numbers [] = new int[size];
        //input
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for(int i = 0; i < numbers.length - 1; i++){ //NOTICE numbers.length - 1 as termination condition

            if(numbers[i] > numbers[i + 1]){ //This is the condition for descending order

                isAscending = false;

            }
        }
        if(isAscending){
            System.out.println("The array is sorted in Ascending Order");
        }else{
            System.out.println("The array is not sorted in Ascending Order");
        }
    }
    
}
