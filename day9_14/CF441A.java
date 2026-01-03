package day9_14;
import java.util.*;

public class CF441A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int amount = sc.nextInt();

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            boolean ok = false;

            for(int j = 0; j < x; j++) {
                int price = sc.nextInt();
                if(price < amount) {
                    ok = true;
                }
            }

            if(ok) {
                result.add(i + 1); // store 1-based index
            }
        }

        System.out.println(result.size());
        for(int idx : result) {
            System.out.print(idx + " ");
        }
    }
}
