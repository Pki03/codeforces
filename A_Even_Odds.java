import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A_Even_Odds
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().trim().split(" ");
        long n = Long.parseLong(parts[0]);
        long k = Long.parseLong(parts[1]);


        long oddcount= (n+1)/2;

        if(k<=oddcount)
        {
            System.out.println(2*k-1);
        }

        else
        {
            long remainingpos= k-oddcount;
            System.out.println(2*remainingpos);
        }
    }
}