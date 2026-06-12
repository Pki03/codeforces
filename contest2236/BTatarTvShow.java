import java.util.*;

public class BTatarTvShow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            char[] s = sc.next().toCharArray();

            // Only indices 0..n-k-1 can be chosen as move start.
            // By the time we reach i, the only way to fix s[i] is to flip at i now.
            for (int i = 0; i <= n - k - 1; i++) {
                if (s[i] == '1') {
                    s[i] ^= 1;
                    s[i + k] ^= 1;
                }
            }

            boolean ok = true;
            for (int i = 0; i < n; i++) {
                if (s[i] == '1') {
                    ok = false;
                    break;
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}
