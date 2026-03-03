import java.util.*;
public class HalfDiamondPattern {
    public static void main(String[] args) {
        int n = 5;
        //outer loop
        for(int i = 1; i <= n; i++){
            //inner loop
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
         for(int i = n - 1; i >= 1; i--){
            //inner loop
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();

    }

  }
}
 
    

