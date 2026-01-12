import java.util.*;

public class B_Hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long s = sc.nextLong();
            long k = sc.nextLong();
            long m = sc.nextLong();

            long result;

            if (s <= k) {
                long elapsed = m % k;
                result = s - elapsed;
                if (result < 0) result = 0;
            } else {
                long idx = m / k;
                long elapsed = m % k;

                long startSand;
                if (idx % 2 == 0) {
                    startSand = s;
                } else {
                    startSand = k;
                }

                result = startSand - elapsed;
            }

            System.out.println(result);
        }
    }
}
