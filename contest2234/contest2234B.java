import java.io.*;

public class contest2234B {

    static boolean isPalindrome(long n) {
        String s = Long.toString(n);
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        long[] palindromes = {0,1,2,3,4,5,6,7,8,9,11,22};

        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            boolean found = false;

            for (long a : palindromes) {
                if (a <= n && (n - a) % 12 == 0) {
                    sb.append(a).append(" ").append(n - a).append("\n");
                    found = true;
                    break;
                }
            }

            if (!found) sb.append("-1\n");
        }

        System.out.print(sb);
    }
}