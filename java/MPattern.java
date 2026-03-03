import java.util.*;
public class MPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            //1st part
            for(int j = 1; j <= i; j++){
            if(j == i || j == 1){
                System.out.print("*");
            } else{
                System.out.print(" ");
            }
        }
            // spaces
            int spaces =(n - 1);
            for(int j = i; j <= spaces; j++){
                System.out.print(" ");

            }
            // 2nd part 
            for(int j = n; j >= 1; j--){
                if(j == i || j == 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
             System.out.println();
        }
    }
    
}
