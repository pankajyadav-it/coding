import java.util.*;
public class InFnGreaterNumber {
    public static int findGreaterInTwoNumber(int a,int b){
        if(a > b){
            return a;
        } else {
            return b;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:");
        int b = sc.nextInt();
         int result = findGreaterInTwoNumber(a,b);
         System.out.println("Greater Number:" +result);
        
    }
}
