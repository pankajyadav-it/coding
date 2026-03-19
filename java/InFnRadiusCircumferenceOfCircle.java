import java.util.*;
public class InFnRadiusCircumferenceOfCircle {
    public static double findCircumferenceOfCircle(double r){
        return 2*3.14*r;  
        }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Radius:");
    double r = sc.nextDouble();
    double result = findCircumferenceOfCircle(r);
    System.out.println("Circumference of Circle:" +result);
}
}