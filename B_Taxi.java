import java.io.*;
import java.util.*;

public class B_Taxi {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int one = 0, two = 0, three = 0, four = 0;

        for(int i = 0; i < n; i++){
            int x = Integer.parseInt(st.nextToken());
            if(x == 1) one++;
            else if(x == 2) two++;
            else if(x == 3) three++;
            else four++;
        }

        int taxis = 0;

        // Step 1: all 4s
        taxis += four;

        // Step 2: 3 + 1
        int pair = Math.min(three, one);
        taxis += pair;
        three -= pair;
        one -= pair;

        // Step 3: remaining 3s
        taxis += three;

        // Step 4: 2 + 2
        taxis += two / 2;
        two = two % 2;

        // Step 5: one 2 + up to two 1s
        if(two == 1){
            taxis++;
            one -= Math.min(2, one);
        }

        // Step 6: remaining 1s
        if(one > 0){
            taxis += (one + 3) / 4;
        }

        System.out.println(taxis);
    }
}
