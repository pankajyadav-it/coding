import java.util.*; 
public class AllChatPrint {
    public static void main(String[] args) {
        String firstName = "Pankaj";
        String lastName = "Yadav";
        String fullName = firstName + lastName;
        //chat...
        for(int i = 0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
    
}
