import java.util.*;
public class TwoNumberCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        double a = sc.nextDouble();
        System.out.println("Enter Second Number");
        double b = sc.nextDouble();
        System.out.println("Choose operation: + - * / % ");
       char op = sc.next().charAt(0);
      if (op == '+'){
        System.out.println("Addition =" + (a + b));
    } else if (op == '-'){
        System.out.println("Subtraction =" + (a - b));
    } else if (op == '*'){
        System.out.println("Multiplication =" + (a * b));
    } else if (op == '/'){
        System.out.println("Divison =" + (a / b));
    } else if (op == '%'){
        System.out.println("Reminder =" + (a % b));
    } else{
        System.out.println("Invalid Operator");
    }
  }
}
