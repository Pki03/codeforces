import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);

        String str= s.nextLine();

        Set<Character> uniqueChars= new HashSet<>();

        for(int i=0;i<str.length();i++)
        {
            uniqueChars.add(str.charAt(i));
        }

        if(uniqueChars.size()%2==0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else
        {
            System.out.println("IGNORE HIM!");
        }

        
    }
}