import java.util.*;

public class Main {

    static class Pair {   
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        Pair[] arr = new Pair[n];

        for (int i = 0; i < n; i++) {
            int first = s.nextInt();
            int second = s.nextInt();
            arr[i] = new Pair(first, second);
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (arr[i].first == arr[j].second) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
