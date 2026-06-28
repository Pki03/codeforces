import java.util.*;

public class BCrimsonTriples
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0)
        {
            int n = sc.nextInt();
            long answer = 0;
            for (int b = 1; b <= n; b++)
            {
                long multiples = n / b;
                answer += multiples * multiples;
            }
            System.out.println(answer);
        }
    }
}
