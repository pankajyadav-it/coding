import java.util.*;
public class PrintCountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0, negetive = 0, zero = 0;
        int choice;
    do {
    System.out.println("Enter a Number:");
    int num = sc.nextInt();
    if(num > 0){
        positive++;
    } else if(num < 0){
        negetive++;
    } else{
        zero++;
    }
    System.out.println("Press 1 to continue, 0 to stop:");
    choice = sc.nextInt();
    } while(choice == 1);
    System.out.println("Positive Number:" +positive);
    System.out.println("Negative Number:" +negetive);
    System.out.println("Zero Number:" +zero);
}

}
