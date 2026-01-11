import java.util.*;

class A_Game_with_Integers
{
    
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            if(n%3==0)System.out.println("Second");
            else
            {
                System.out.println("First");
            }
        }
    }
}