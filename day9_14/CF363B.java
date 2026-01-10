package day9_14;
import java.util.*;

public class CF363B 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr= new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int left=0;
        int sum=0;
        int min=Integer.MAX_VALUE;

        int min_idx=0;

        for(int i=0;i<m;i++)
        {
            sum+=arr[i];
        }

        min=Math.min(sum,min);
        for(int i=m;i<n;i++)
        {
            sum+=arr[i];
            sum-=arr[i-m];
            if(min>sum)
            {
                min=sum;
                min_idx=i-m+1;
            }
        }


        System.out.println(min_idx+1);
    }




    
}
