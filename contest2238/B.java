import java.util.*;

public class B {

    public static  void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0)
        {
            int n=sc.nextInt();
            long ans=0;
            for(int b=1;b<=n;b++)
            {
                long multiples=n/b;
                ans+=multiples*multiples;
            }
            System.out.println(ans);
        }
    }

    
}
