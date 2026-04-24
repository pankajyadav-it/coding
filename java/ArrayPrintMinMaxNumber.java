import java.util.*;
public class ArrayPrintMinMaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many Numbers:");
        int size = sc.nextInt();
        System.out.println("Enter the Numbers:");
        int numbers [] = new int[size];
        //input
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //OUTPUT
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Smallest Number is:" +min);
        System.out.println("Largest Number is:" +max);

    }
    
}
