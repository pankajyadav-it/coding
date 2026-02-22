import java.util.*;
public class NumberCompare { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b){
            System.out.println("Both are Equal");
        } else{
            System.out.println("Both are Not Equal");
            if (a > b){
                System.out.println("a is Greater");
            } else{
                System.out.println("a is Lessar");
            }
        }
    }
    
}
