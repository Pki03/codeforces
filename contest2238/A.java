import java.util.*;

public class A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0)
        {
            int n = sc.nextInt();
            int costReorder = sc.nextInt();
            int[] arr = new int[n];
            int[] target = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            for (int i = 0; i < n; i++) target[i] = sc.nextInt();

            long answer = Long.MAX_VALUE;

            boolean noSortOk = true;
            long noSortCost = 0;
            for (int i = 0; i < n; i++)
            {
                if (arr[i] < target[i]) noSortOk = false;
                else noSortCost += arr[i] - target[i];
            }
            if (noSortOk) answer = Math.min(answer, noSortCost);

            int[] sortedArr = arr.clone();
            int[] sortedTarget = target.clone();
            Arrays.sort(sortedArr);
            Arrays.sort(sortedTarget);

            boolean sortOk = true;
            long sortCost = costReorder;
            for (int i = 0; i < n; i++)
            {
                if (sortedArr[i] < sortedTarget[i]) sortOk = false;
                else sortCost += sortedArr[i] - sortedTarget[i];
            }
            if (sortOk) answer = Math.min(answer, sortCost);

            System.out.println(answer == Long.MAX_VALUE ? -1 : answer);
        }
    }
}
