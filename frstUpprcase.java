public class frstUpprcase {
    public static void main(String[] args) {
        String str="my name is harsh narayan";
        System.out.println(upper(str));
        
    }

    public static String upper(String s){
        StringBuilder sb=new StringBuilder("");
        sb.append(Character.toUpperCase(s.charAt(0)));

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' '){
                sb.append((s.charAt(i)));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else{
                sb.append((s.charAt(i)));
            }
        }

        return sb.toString();


        
    }
    
}
