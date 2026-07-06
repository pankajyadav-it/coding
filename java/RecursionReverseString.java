public class RecursionReverseString {
    public static void revString(String str){
        if(str.length() == 1){
            return str;
        }
        Char currchar = str.CharAt(0);
        String nextString = revString(str.substring(1));

    }
    public static void main(String[] args) {
        String str = "abcd";
        String reversed = revString(str);
        System.out.println(reversed);
    }
    
}
