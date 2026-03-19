import java.util.*;
public class InFnPowerOfNumber {
    public static int powerOfNumber(int x,int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result = result * x;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter of x Value:");
        int x = sc.nextInt();
        System.out.println("Enter of n Value:");
        int n = sc.nextInt();
        int result = powerOfNumber(x,n);
        System.out.println("Power Of Number:" +result);
    }
    
}
