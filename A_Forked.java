import java.util.*;

public class A_Forked {

    static class Point {
        long x, y;
        Point(long x, long y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Point)) return false;
            Point p = (Point) o;
            return x == p.x && y == p.y;
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(x,y);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- > 0) {
            long a = s.nextLong();
            long b = s.nextLong();
            long xk = s.nextLong();
            long yk = s.nextLong();
            long xq = s.nextLong();
            long yq = s.nextLong();

            Set<Point> king = new HashSet<>();
            Set<Point> queen = new HashSet<>();

            long[] dx = {a, a, -a, -a, b, b, -b, -b};
            long[] dy = {b, -b, b, -b, a, -a, a, -a};

            for (int i = 0; i < 8; i++) {
                king.add(new Point(xk + dx[i], yk + dy[i]));
                queen.add(new Point(xq + dx[i], yq + dy[i]));
            }

            int count = 0;
            for (Point p : king) {
                if (queen.contains(p)) count++;
            }

            System.out.println(count);
        }
    }
}
