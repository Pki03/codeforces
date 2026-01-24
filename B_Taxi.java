import java.io.*;
import java.util.*;

public class B_Taxi {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        String[] parts = br.readLine().trim().split(" ");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(parts[i]);
        }

        Arrays.sort(arr);

        int i = 0, j = n - 1;
        int taxis = 0;

        while(i <= j){
            int capacity = 4;
            capacity -= arr[j];  // take largest
            j--;

            // fill with smallest as much as possible
            while(i <= j && arr[i] <= capacity){
                capacity -= arr[i];
                i++;
            }

            taxis++;
        }

        System.out.println(taxis);
    }
}
