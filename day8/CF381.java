package day8;
import java.util.*;
public class CF381 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]= s.nextInt();
            
        }
        int i=0;
        int j=n-1;

        boolean sereja=true;
        int serejaSum=0;
        int dimaSum=0;
        while(i<=j)
        {
            if(sereja)
            {
                if(arr[i]>arr[j])
                {
                    serejaSum+=arr[i];
                    i++;
                }
                else
                {
                    serejaSum+=arr[j];
                    j--;
                }
                sereja=false;
            }
            else
            {
                if(arr[i]>arr[j])
                {
                    dimaSum+=arr[i];
                    i++;
                }
                else
                {
                    dimaSum+=arr[j];
                    j--;
                }
                sereja=true;
            }

        }

        System.out.println(serejaSum+" "+dimaSum);
        
    }

    
}
