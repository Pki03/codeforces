package contest2237;

import java.util.*;

public class ADestroyingTowers {


    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int[] arr= new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i]=s.nextInt();
            }

            for(int i=0;i<n-1;i++)
            {
                int j=i+1;
                while(j<n)
                {
                    if(arr[j]>arr[i])
                    {
                        arr[j]=arr[i];
                        break;
                    }
                    j++;
                }
            }
            int sum=0;

            for(int i=0;i<n;i++)
            {
                sum+=arr[i];

            }

            System.out.println(sum);
        }

    }
    
}
