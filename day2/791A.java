import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);

        int x= s.nextInt();
        int y= s.nextInt();
        int year=0;

        while(x<=y)
        {
            x= x*3;
            y= y*2;
            year++;
        }
        
        System.out.println(year);   
       
            
    }
}