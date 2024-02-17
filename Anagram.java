import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="Break";
        String str2="Baker";
        System.out.println(Anagrams(str1, str2));

    }

    public static boolean Anagrams(String s1,String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        char[] st1=s1.toCharArray();
        char[] st2=s2.toCharArray();

        Arrays.sort(st1);
        Arrays.sort(st2);

        if(Arrays.equals(st1, st2))
        return true;
        else
        return false;
    }
    
}
