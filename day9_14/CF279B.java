package day9_14;
import java.util.*;


// this is a classical two poiter approach 
public class CF279B {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();

        int[] arr1= new int[n];

        for(int i=0;i<n;i++)
        {
            arr1[i]= sc.nextInt();
        }

        int left=0;
        int sum=0;

        int ans=0;

        for(int right=0;right<n;right++)
        {
            sum+= arr1[right];

            while(sum>m)
            {
                sum-= arr1[left];
                left++;
            }

            ans=Math.max(ans, right-left+1);
        }

        System.out.println(ans);


    }

    
}
