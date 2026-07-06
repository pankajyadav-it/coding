public class RecursionFactorial {
    public static void printFactorial(int n,int fact){
    if(n == 0){
    System.out.println(fact);
    return;
    }
    fact *= n;
    printFactorial(n-1,fact);
}
    public static void main (String args[]){
        System.out.println("Factorial Value:");
        printFactorial(5,1);
    }
}
