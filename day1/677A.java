import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int h= s.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            int a= s.nextInt();
            arr[i]=a;
        }

        int x=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>h)
            {
                x+=2;
            }
            else
            {
                x+=1;
            }
        }
        System.out.println(x);
    }
}