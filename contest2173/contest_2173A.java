package contest2173;
import java.util.*;

public class contest_2173A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n= sc.nextInt();
            int k= sc.nextInt();

            String str= sc.next();

            char[] arr= str.toCharArray();

            int sleepcount=0;
            int blockeduntil=-1;


            for(int i=0;i<n;i++)
            {
                if(arr[i]=='1')
                {
                    blockeduntil= i+k;

                }
                else
                {
                    if(i<=blockeduntil)
                    {
                    }
                    else
                    {
                        sleepcount++;
                    }
                    
                }

            }

            System.out.println(sleepcount);

        }
    }
}