import java.util.*;
public class A_Line_Trip
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);

        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int end=s.nextInt();

            int[] arr= new int[n+2];

            arr[0]=0;
            arr[arr.length-1]=end;

            for(int i=1;i<arr.length-1;i++)
            {
                arr[i]=s.nextInt();
            }

            int ans=0;
            for(int i=1;i<arr.length-1;i++)
            {
                ans=Math.max(ans,arr[i]-arr[i-1]);
            }
            ans=Math.max(ans,2*(arr[arr.length-1]-arr[arr.length-2]));

            System.out.println(ans);
        }

    }
}