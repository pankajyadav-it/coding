import java.util.*;
public class InFunctionTwoNumberMultiply {
    public static int calculateProduct(int a,int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        System.out.println("Enter first Number: ");
        System.out.println("Enter Second Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = calculateProduct(a,b);
        System.out.println("Product of two Number:"+calculateProduct(a,b));
    }
}
