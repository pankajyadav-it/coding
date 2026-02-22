import java.util.*;
public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Enter marks");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Enter your marks:");
                int marks = sc.nextInt();
            if(marks >= 90){
            System.out.println("This is Good");            
             } else if (marks >= 60){
                System.out.println("This is also Good");
              } else if(marks >= 0){
                System.out.println("This is Good as Well");
              }
            }
        } 
        while(choice != 0);
    }
    
}
