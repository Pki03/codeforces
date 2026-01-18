
import java.io.*;

public class B_Swap_and_Delete
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());

        StringBuilder out=new StringBuilder();

        while(t-->0)
        {
            String s= br.readLine();
            int n=s.length();
            int cnt0=0;
            int cnt1=0;

            for(char c:s.toCharArray())
            {
                if(c=='0')
                {
                    cnt0++;
                }
                else
                {
                    cnt1++;
                }
            }
            int matched=0;

            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='0')
                {
                    if(cnt1>0)
                    {
                        cnt1--;
                        matched++;
                    }
                    else
                    {
                        break;
                    }
                }
                else
                {
                    if(cnt0>0)
                    {
                        cnt0--;
                        matched++;
                    }
                    else
                    {
                        break;
                    }
                }
            }


            int ans=n-matched;
            out.append(ans).append("\n");






        }
        System.out.print(out.toString());


    }
}