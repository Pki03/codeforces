package day8;
import java.util.*;

public class CF71A {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        int n= s.nextInt();
        for(int i=0;i<n;i++){
            String str= s.next();
            if(str.length()>10){
                System.out.println(""+str.charAt(0)+(str.length()-2)+str.charAt(str.length()-1));
            }
            else
            {
                System.out.println(str);
            }

    }
}
    
}
