import java.lang.*;

public class driven {
    //static StringBuilder one;
    //static StringBuilder two;
    
    public static boolean isPalindrome(String one, String two){

            
        
            if(one.isEmpty()){
                return false;
            }
        
            if(two.isEmpty()){
                StringBuilder sb = new StringBuilder();
                two = sb.append(one).reverse().toString();
                return isPalindrome(one, two);
            }
            else{
                return false;
            }
    
        }
}
