package contest2238;
import java.util.*;

public class CVillageGuilds
{
    static List<List<Integer>> tree;
    static long answer;

    static int dfs(int node)
    {
        List<Integer> childHeights = new ArrayList<>();
        for (int child : tree.get(node))
        {
            int h = dfs(child);
            childHeights.add(h);
        }
        if (childHeights.isEmpty()) return 0;

        Collections.sort(childHeights, Collections.reverseOrder());
        if (childHeights.size() >= 2)
        {
            int secondMax = childHeights.get(1);
            answer += secondMax + 1;
        }
        return childHeights.get(0) + 1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0)
        {
            int n = sc.nextInt();
            tree = new ArrayList<>(n + 1);
            for (int i = 0; i <= n; i++) tree.add(new ArrayList<>());
            for (int i = 2; i <= n; i++)
            {
                int parent = sc.nextInt();
                tree.get(parent).add(i);
            }
            answer = n;
            dfs(1);
            System.out.println(answer);
        }
    }
}
