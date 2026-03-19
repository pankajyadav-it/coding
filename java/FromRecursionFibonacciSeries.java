import java.util.*;
public class FromRecursionFibonacciSeries {
    public static int fibonacci(int n){
        if(n <= 1) //base case
        return n;
        return fibonacci(n-1) + fibonacci(n-2); //recursive call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Terms:");
        int n = sc.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 0; i < n; i++){
            System.out.print(fibonacci(i) + " ");
        }

    }
    
}
