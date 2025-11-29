import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        int n= s.nextInt();
        int k=s.nextInt();

        int num=1;
        while(num*n%10!=0 && num*n%10!=k)
        {
            num++;
        }
        System.out.println(num);
    }
    
}
