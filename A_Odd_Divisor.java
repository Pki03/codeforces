import java.io.BufferedReader;
import java.io.InputStreamReader;

public  class A_Odd_Divisor
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long t= Long.parseLong(br.readLine().trim());
        while(t-->0)
        {
            long num= Long.parseLong(br.readLine().trim());

            if((num&(num-1))==0)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");


            }


        }
        
    }
}