import java.util.Scanner;

public class shortestpath {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter path");
        String str=in.nextLine();
        System.out.println((getshortestpath(str)));

        
    }

    public static float getshortestpath(String s){
        int n=s.length();
        int x=0,y=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='N')
            y++;

            if(s.charAt(i)=='S')
            y--;

            if(s.charAt(i)=='E')
            x++;

            if(s.charAt(i)=='W')
            x--;
            
        }

        int x2=x*x;
        int y2=y*y;

        float sd=(float)Math.sqrt(x2+y2);
        return sd;


    }
    
}
