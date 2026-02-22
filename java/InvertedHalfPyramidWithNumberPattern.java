import java.util.*;
public class InvertedHalfPyramidWithNumberPattern {
    public static void main(String[] args) {
        int n = 5;
        // outer loop
        for(int i = n; i >= 1; i--){
            //ineer loop
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");                
            }
            System.out.println();
        }
    }
    
}
