public class compression {
    public static void main(String[] args) {
        String str="aaabbcdddeeeee";
        System.out.println(Stringcompression(str));

        
    }

    public static String Stringcompression(String s){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            Integer count =1;
            while((i<s.length()-1)&&(s.charAt(i)==(s.charAt(i+1)))){
                count++;
                i++;
            }
            sb.append(s.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }

        
        }
        return sb.toString();
    }
    
}
