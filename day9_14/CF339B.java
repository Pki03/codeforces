package day9_14;
import java.util.*;;
public class CF339B 
{
    public static void main(String[] args) {

        // Implementation goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        

        int[] arr= new int[m];
        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextInt();
        }
        int init=1;
        long sum=0;
        for(int i=0;i<m;i++)
        {
            int x=arr[i];
            if(x<init)
            {
                sum+=n-init+x;
            }
            else
            sum+=x-init;

            init=x;  
        }

        System.out.println(sum);
    }

    
}
