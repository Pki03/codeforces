package contest2173;
import java.util.*;

//couldnt solve

public class contest_2173B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            for (int i = 0; i < n; i++) b[i] = sc.nextLong();

            long pos = 0, neg = 0;

            for (int i = 0; i < n; i++) {
                long newPos = Math.max(pos - a[i], b[i] - neg);
                long newNeg = Math.max(neg - a[i], b[i] - pos);
                pos = newPos;
                neg = newNeg;
            }

            System.out.println(Math.max(pos, neg));
        }
    }
}
