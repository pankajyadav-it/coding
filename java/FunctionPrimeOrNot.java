import java.util.*;
public class FunctionPrimeOrNot {
    public static void printPrime (int n){
        //loop
    if(n <= 1){
        System.out.println("Not Prime");
        return;
    }
    for(int i = 2; i <= n/2; i++){
        if(n % i == 0){
            System.out.println("Not Prime");
            return;
        }
    }
    System.out.println("Prime Number");
    }
        public static void main(String args []){
            System.out.println("Enter a Number: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printPrime(n);
        }
    
    
}
