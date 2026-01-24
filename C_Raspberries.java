import java.io.*;

public class C_Raspberries
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int t= Integer.parseInt(br.readLine());

        while(t-->0)
        {
            String[] parts= br.readLine().split(" ");
            int n=Integer.parseInt(parts[0]);
            int k=Integer.parseInt(parts[1]);

            int[] a= new int[n];
            parts=br.readLine().split(" ");

            for(int i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(parts[i]);
            }

            int ans=Integer.MAX_VALUE;

            if(k==2 || k==3 || k==5)
            {
                for(int i=0;i<n;i++)
                {
                    int cost= (k-a[i]%k)%k;
                    ans=Math.min(ans,cost);
                }
            }

            if(k==4)
            {
                int ansfirst=Integer.MAX_VALUE;
                for(int i=0;i<n;i++)
                {
                    int cost=(k-a[i]%k)%k;
                    ansfirst=Math.min(ansfirst,cost);
                }

                int anssecond=Integer.MAX_VALUE;
                int evecount=0;

                for(int i=0;i<n;i++)
                {
                    if(a[i]%2==0)evecount++;
                }

                if(evecount>=2)
                {
                    anssecond=0;
                }
                else if(evecount==1)
                {
                    anssecond=1;
                }
                else
                {
                    anssecond=2;
                }

                ans=Math.min(ansfirst,anssecond);
            }

            System.out.println(ans);


        }

    }
}