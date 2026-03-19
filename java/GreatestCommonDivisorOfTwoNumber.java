import java.util.*;
public class GreatestCommonDivisorOfTwoNumber {
    public static int findGcdOfTwoNumber(int a, int b){
        //Base case
        if(b == 0)
         return a;
        //Recursive call
        return findGcdOfTwoNumber(b, a % b);
} 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:");
        int b = sc.nextInt();
        int result = findGcdOfTwoNumber(a,b);
        System.out.println("GCD Of Two Number:" +result);
    }
}
