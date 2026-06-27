import java.util.*;

public class B {
    static final long MOD = 998244353;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            long n = s.nextLong(), m = s.nextLong();
            long r = s.nextLong(), c = s.nextLong();
            long power = n * m - (n - r + 1) * (m - c + 1);
            System.out.println(pow(2, power));
        }
    }

    static long pow(long a, long e) {
        long res = 1;
        while (e > 0) {
            if ((e & 1) == 1) res = res * a % MOD;
            a = a * a % MOD;
            e >>= 1;
        }
        return res;
    }
}
