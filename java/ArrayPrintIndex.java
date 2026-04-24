import java.util.*;
public class ArrayPrintIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int size = sc.nextInt();
        System.out.println("Search for Numbers:");
        int numbers [] = new int [size];
        for(int i = 0; i < size; i++){
            numbers [i] = sc.nextInt();
        }
        System.out.println("Search Index For Any Number:");
        int x = sc.nextInt();
            for(int i = 0; i < numbers.length; i++){
               if(numbers[i] == x){
                System.out.println("Index Number:" +i);
               }
            }
    }
    
}
