import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A_Divisibility_Problem
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long t= Long.parseLong(br.readLine().trim());
        while(t-->0)
        {
            String[] parts = br.readLine().trim().split(" ");
            long b = Long.parseLong(parts[0]);
            long a = Long.parseLong(parts[1]);

            long ans= ((b+a-1)/a)*a-b;

            System.out.println(ans);

        }
    }
}