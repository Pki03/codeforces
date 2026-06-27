import java.util.*;

public class AnotherPopcountProblemA {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            long n = s.nextLong(), k = s.nextLong();
            long ans = 0;
            for (long bit = 1; bit <= n && k > 0; bit <<= 1) {
                long take = Math.min(k, n / bit);
                ans += take;
                n -= take * bit;
            }
            System.out.println(ans);
        }
}
}