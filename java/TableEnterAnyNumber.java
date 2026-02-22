import java.util.*;
public class TableEnterAnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        for( int i =1; i < 11; i++){
            System.out.println(i * n);
        }
        
    }
    
}
