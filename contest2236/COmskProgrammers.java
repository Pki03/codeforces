import java.util.*;

public class COmskProgrammers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();

            long ans = Math.abs(a - b);

            // Try dividing a k times and b l times, then fix with +1 ops.
            long aa = a;
            for (int k = 0; k <= 60; k++) {
                long bb = b;
                for (int l = 0; l <= 60; l++) {
                    ans = Math.min(ans, k + l + Math.abs(aa - bb));
                    if (bb == 0) break;
                    bb /= x;
                }
                if (aa == 0) break;
                aa /= x;
            }

            System.out.println(ans);
        }
    }
}
