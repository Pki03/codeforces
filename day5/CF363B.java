import java.util.*;

public class CF363B {

    public static void main(String[] args) 
    {
        Scanner s= new  Scanner(System.in);
        int n= s.nextInt();
        int m= s.nextInt();

        int[] arr= new int[n];
        for(int i=0;i<m;i++)
        {
            arr[i]=s.nextInt();
        }

        int x=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {
            sum+=arr[i];

        }
        min=sum;

        for(int i=m;i<n;i++)
        {
            sum+=arr[i];
            sum-=arr[i-m];
            if(sum<min)
            {
                min=sum;
                x=i-m+1;
            }
            
        }

        System.out.println(x);

    }
    
}
