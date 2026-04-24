import java.util.*;
public class ArrayPrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int size = sc.nextInt();
        String names [] = new String[size];
        //input
        System.out.println("Enter the Names:");
        for(int i = 0; i < size; i++){
            names[i] = sc.next(); 
        }
        //output
        for(int i = 0; i < names.length; i++){
            System.out.println("Names " +(i+1) +" is :" +names[i]);
        }
    }
    
}
