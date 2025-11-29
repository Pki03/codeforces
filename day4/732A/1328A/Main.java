
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int t= s.nextInt();
        while(t-->0)
        {
            int a= s.nextInt();
            int b=s.nextInt();

            if(a%b==0)
            {
                System.out.println(0);
            }
            else
            {
                System.out.println(b-(a%b));
            }
        }
    }
    
}
