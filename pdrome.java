import java.util.*;
public class pdrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=in.nextLine();
        System.out.println(ispalindrome(str));

        

        
    }

    public static boolean ispalindrome(String s){
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(!(s.charAt(i)==s.charAt(n-i-1))){
                return false;
            }
        }
        return true;

    }
    
}
