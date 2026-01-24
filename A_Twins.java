import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class A_Twins {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        String[] parts = br.readLine().trim().split(" ");
        int[] arr = new int[n];

        int total = 0;
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(parts[i]);
            total += arr[i];
        }

        Arrays.sort(arr);

        int mySum = 0;
        int count = 0;

        for(int i = n-1; i >= 0; i--){
            mySum += arr[i];
            count++;
            if(mySum > total - mySum){
                break;
            }
        }

        System.out.println(count);
    }
}
