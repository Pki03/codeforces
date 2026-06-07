import java.io.BufferedReader;
import java.io.InputStreamReader;


public class A_LCM_Challenge
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        long n =Long.parseLong(br.readLine().trim());

        if (n == 1) {
            System.out.println(1);
            return;
        }
        if (n == 2) {
            System.out.println(2);
            return;
        }
        if (n == 3) {
            System.out.println(6);
            return;
        }

        long ans = 0;

        // Try best combinations near n
        ans = Math.max(ans, lcm3(n, n-1, n-2));
        ans = Math.max(ans, lcm3(n, n-1, n-3));
        ans = Math.max(ans, lcm3(n-1, n-2, n-3));

        System.out.println(ans);


        


    }
    public static long lcm(long a, long b)
    {
        return a*b/gcd(a,b);
    }
    public static long gcd(long a, long b)
    {
        while(b!=0)
        {
            long temp=b;
            b=a%b;
            a=temp;
        }

        return a;
    }

    public static long lcm3(long a, long b, long c)
    {
        return lcm(a,lcm(b,c));
    }

}