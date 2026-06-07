import java.util.*;

public class contest2234A
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int t= s.nextInt();
        while(t-->0)
        {
            int n= s.nextInt();
            int[] b= new int[n];

            for(int i=0;i<n;i++)
            {
                int x= s.nextInt();
                b[i]=x;
            }
            Arrays.sort(b);
            for(int i=0;i<n/2;i++)
            {
                int temp=b[i];
                b[i]=b[n-1-i];
                b[n-1-i]=temp;
            }

            boolean flag= true;
            for(int i=0;i<n-2;i++)
            {
                if(b[i]%b[i+1]!=b[i+2])
                {
                    flag=false;
                    break;
                }
            }
            
            if (flag) {
                System.out.println(b[0]+" "+ b[1]);
            } else {
                System.out.println(-1);
            }
        }
    }


}