import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        while(n>0)
        {
            String word= s.nexxt();
            int len = word.length();

            if(len>10)
            {
                System.out.println(word.charAt(0)+ "" + (len-2) + "" + word.charAt(len-1));
                n--;
            }
            else
            {
                System.out.println(word);
                n--;
            }
        }
    }
} 