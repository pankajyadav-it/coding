import java.util.*;
public class InvertedHalfPyramidPattern {
    public static void main(String[] args) {
        int n = 6;
    //outer loop
    for(int i = n; i >= 1; i--){
        //outer loop
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
  }
    
}
