import java.util.*;

public class CF1551A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long a = n / 3;
            long r = n % 3;

            long c1, c2;

            if (r == 0) {
                c1 = a;
                c2 = a;
            } else if (r == 1) {
                c1 = a + 1;
                c2 = a;
            } else { // r == 2
                c1 = a;
                c2 = a + 1;
            }

            System.out.println(c1 + " " + c2);
        }
    }
}
