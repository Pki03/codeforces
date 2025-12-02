import java.util.*;

public class CF363B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int min = sum;
        int start = 0; // 0-based index

        for (int i = k; i < n; i++) {
            sum += arr[i];
            sum -= arr[i - k];

            if (sum < min) {
                min = sum;
                start = i - k + 1;
            }
        }

        System.out.println(start + 1); // convert to 1-based
    }
}
