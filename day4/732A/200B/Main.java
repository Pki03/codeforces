import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int sum=0;
        int x=n;
        while(n-->0)
        {
            int a= s.nextInt();
            sum+=a;
            
        }
        System.out.println((float)sum/x); 
    }
    
}
