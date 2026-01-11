import java.util.*;

public class A_Halloumi_Boxes 
{

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        int t=s.nextInt();
        while(t-->0)
        {
            int n= s.nextInt();
            int k=s.nextInt();

            int[] arr= new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i]=s.nextInt();
            }

            if(k>=2)
            {
                System.out.println("YES");
            }

            if(k==1)
            {
                boolean sorted=true;
                for(int i=1;i<n;i++)
                {
                    if(arr[i-1]>arr[i])
                    {
                                        System.out.println("NO");
                                        sorted=false;
                                        break;
                    }
                }
                if(sorted)
                System.out.println("YES");
            }

            

            
        }


        
    }
}
