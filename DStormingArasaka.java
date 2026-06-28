import java.util.*;

public class DStormingArasaka
{
    static final int MAX = 1000000;
    static int[] spf = new int[MAX + 1];

    static void sieve()
    {
        for (int i = 2; i <= MAX; i++) spf[i] = i;
        for (int i = 2; i * i <= MAX; i++)
        {
            if (spf[i] == i)
            {
                for (int j = i * i; j <= MAX; j += i)
                {
                    if (spf[j] == j) spf[j] = i;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        sieve();
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0)
        {
            int n = sc.nextInt();
            int total = 0;
            int distinct = 0;
            int prev = 0;
            while (n > 1)
            {
                int p = spf[n];
                if (p != prev)
                {
                    distinct++;
                    prev = p;
                }
                total++;
                n /= p;
            }
            System.out.println(total + distinct - 1);
        }
    }
}
