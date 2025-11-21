import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        String s1= s.next().toLowerCase();
        String s2= s.next().toLowerCase();

        int cmp= s1.compareTo(s2);
        if(cmp<0)
        {
            System.out.println("-1");
        }
        else if(cmp>0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
}