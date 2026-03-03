import java.util.*;
public class FunctionEvenOrOdd {
    public static void printEvenOrOdd(int n){
        if(n % 2 == 0){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
            return;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printEvenOrOdd(n);
        sc.close();
    }
}
