import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        String x= s.next();



        String[] arr= x.split("\\+");

        Arrays.sort(arr);



        StringBuilder sb= new StringBuilder();

        for(int i=0;i<arr.length;i++)
        {
            if(i>0)
            {
                sb.append("+");
            }
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());



    }
    
}
