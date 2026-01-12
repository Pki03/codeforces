import java.util.*;
public class A_Social_Experiment
{
    public static void main(String[] args)
    {

        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();

            if(n==2)System.out.println("2");
            else if(n==3)System.out.println("3");



            

            else if(n%2==0)
            {
                System.out.println("0");
            }

            else 
            System.out.println("1");
            
        }
        

    }

}