import java.util.*;
public class CF230A {
    public static class Pair
    {
        int first;
        int second;

        Pair(int first, int second)
        {
            this.first= first;
            this.second= second;
        }
    }
    public static void main(String[] args) 
    {
        Scanner s= new  Scanner(System.in);
        int x= s.nextInt();
        int n= s.nextInt();

        Pair[] arr= new Pair[n];

        for(int i=0;i<n;i++)
        {
            int a= s.nextInt();
            int b= s.nextInt();

            arr[i]= new Pair(a,b);

            
        }

        Arrays.sort(arr, (p1, p2) -> Integer.compare(p1.first, p2.first));

        int curr= x;
        for(int i=0;i<n;i++)
        {
            if(curr> arr[i].first)
            {
                curr+= arr[i].second;
            }
            else
            {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
