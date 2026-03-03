import java.util.*;
public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            int num = 1;
            //spaces
            for(int spaces = 0; spaces < n - i; spaces++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(num+" ");
                num = num*(i - j)/(j + 1);

            }
            System.out.println();
        }

    }
    
}
