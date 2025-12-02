import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        long[] c1 = new long[5];
        long[] c2 = new long[5];

        for (int i = 1; i <= n; i++) c1[i % 5]++;
        for (int i = 1; i <= m; i++) c2[i % 5]++;

        long ans = 0;
        ans += c1[0] * c2[0];
        ans += c1[1] * c2[4];
        ans += c1[2] * c2[3];
        ans += c1[3] * c2[2];
        ans += c1[4] * c2[1];

        System.out.println(ans);
    }
}
