import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int[][] arr= new int[5][5];
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                int n = s.nextInt();
                if(n==1)
                {
                    System.out.println(Math.abs(i-3)+Math.abs(j-3));
                    break;
                }
            }
        }
    }
}