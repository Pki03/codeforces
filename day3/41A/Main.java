package day3.41A;
import java.util.*;
public class Main {
    public static void main(String[] args) {   
        
        Scanner s= new Scanner(System.in);

        String x= s.next();
        String y =s.next();

        if(x.length()!=y.length()){
            System.out.println("NO");
            return;
        }

        for(int i=0;i<x.length();i++){
            char a= x.charAt(i);
            char b= y.charAt(x.length()-1-i);

            if(a!=b){
                if(Character.toLowerCase(a) != Character.toLowerCase(b)){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");


        
        
    }
    
}
