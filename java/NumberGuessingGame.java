import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int number = rand.nextInt(100) + 1;
    int guess = 0;
    System.out.println("guess a number between 1 and 100 :");
    while(guess != number){
        System.out.print("Enter your guess :");
        guess = sc.nextInt();
        if(guess < number){
            System.out.println("Too low! Try again.");
        } else if(guess > number){
            System.out.println("Too high! Try again.");
        } else {
            System.out.println("Congratulations! You guessed the number!");
        }
    }




 }
  
}
