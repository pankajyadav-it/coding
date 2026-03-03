import java.util.*;
public class FunctionTablePrint {
    public static void tablePrint(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n * i);
    }
    }
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tablePrint(n);
        sc.close();
    }
}
