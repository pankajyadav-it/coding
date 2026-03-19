import java.util.*;
public class PrintAverageInFunction {
    public static void findAverage(int a, int b, int c){
        double avg = (a + b + c)/3;
        System.out.println("Avg =" + avg);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter second Number:");
        int n2 = sc.nextInt();
        System.out.println("Enter Third Number:");
        int n3 = sc.nextInt();
        findAverage(n1,n2,n3);
    }
    
}
