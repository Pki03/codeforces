import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);    
        String text= s.nextLine();
        StringBuilder result= new StringBuilder();
        for(int i=0;i<text.length();i++)
        {
            if(text.charAt(i)=='A' || text.charAt(i)=='E' || text.charAt(i)=='I' || text.charAt(i)=='O' || text.charAt(i)=='U' || text.charAt(i)=='Y' ||
               text.charAt(i)=='a' || text.charAt(i)=='e' || text.charAt(i)=='i' || text.charAt(i)=='o' || text.charAt(i)=='u' || text.charAt(i)=='y')
            {
                continue;
            }
            else
            {
                result.append('.');
                result.append(Character.toLowerCase(text.charAt(i)));
            }
        }

        System.out.println(result.toString());

    }
}