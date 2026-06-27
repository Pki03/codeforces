
import java.io.*;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] parts = br.readLine().split(" ");
            if (n == 1) {
                sb.append("0\n");
                continue;
            }
            int xor = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(parts[i]);
                xor ^= a[i];
            }
            if (xor == 0) {
                sb.append("1\n");
                continue;
            }
            int msb = 31 - Integer.numberOfLeadingZeros(xor);
            int ans = 0;
            for (int x : a) {
                if ((x >> msb & 1) == 1) ans++;
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}