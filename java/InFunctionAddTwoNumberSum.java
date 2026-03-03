import java.util.*;
public class InFunctionAddTwoNumberSum {
    public static int calculationSum(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter first Number:");
        System.out.println("Enter Second Number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculationSum(a,b);
        System.out.println("Sum of two numbers:"+sum);
    }
}
