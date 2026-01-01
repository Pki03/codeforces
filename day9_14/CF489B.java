package day9_14;
import java.util.*;
public class CF489B {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int m= sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++)
        {
            arr2[i] = sc.nextInt(); 
        }

        Arrays.sort(arr);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<m;i++)
        {
            map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
        }

        int count=0;

        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]-1) && map.get(arr[i]-1)>0)
            {
                count++;
                map.put(arr[i]-1, map.get(arr[i]-1)-1);
            }
            else if(map.containsKey(arr[i]) && map.get(arr[i])>0)
            {
                count++;
                map.put(arr[i], map.get(arr[i]) - 1);
            }
            else if(map.containsKey(arr[i]+1) && map.get(arr[i]+1)>0)
            {
                count++;
                map.put(arr[i]+1, map.get(arr[i]+1) - 1);
            }
        }


        System.out.println(count);

    }
    
}
