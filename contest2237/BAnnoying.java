package contest2237;
import java.util.*;

public class BAnnoying {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();

            int[] L = new int[n];
            boolean ok = true;
            for (int i = 0; i < n; i++) {
                int idx = lowerBound(b, a[i]);
                if (idx == n) { ok = false; break; }
                L[i] = idx + 1;
            }
            if (!ok) { System.out.println(-1); continue; }

            int[] sortedL = L.clone();
            Arrays.sort(sortedL);
            for (int i = 0; i < n; i++)
                if (sortedL[i] > i + 1) ok = false;
            if (!ok) { System.out.println(-1); continue; }

            boolean[] used = new boolean[n + 2];
            long swaps = 0;

            for (int i = 0; i < n; i++) {
                int seat = L[i];
                while (used[seat]) seat++;
                used[seat] = true;

                int crossed = 0;
                for (int s = seat + 1; s <= n; s++)
                    if (used[s]) crossed++;
                swaps += crossed;
            }

            System.out.println(swaps);
        }
    }

    static int lowerBound(int[] arr, int key) {
        int lo = 0, hi = arr.length;
        while (lo < hi) {
            int mid = lo + (hi-lo)/2;
            if (arr[mid] >= key) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }
}