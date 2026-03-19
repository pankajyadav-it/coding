import java.util.*;
public class InFnAgeForVote {
    public static boolean findAgeForVote(int age){
    return age > 18;

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age = sc.nextInt();
        boolean result = findAgeForVote(age);
        System.out.println("Age For Vote:" +result);

    }
    
}
