
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int k=s.nextInt();

        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        
        int required= 5-k;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=required)
            {
                count++;
            }
        }

        System.out.println((int)Math.floor(count/3));
    }
    
}
