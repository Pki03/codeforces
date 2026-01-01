package day9_14;
import java.util.*;
public class CF778A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        String str2= sc.next();

        int[] arr= new int[str.length()];
        for(int i=0;i<str.length();i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        StringBuilder sb= new StringBuilder(str);

        for(int i=0;i<arr.length;i++)
        {
            sb.removeCharAt(arr[i]-1);
            count++;
            if(sb.toString().equals(str2))
            {
                System.out.println(count);
                break;
            }
        }


    }

    
}
