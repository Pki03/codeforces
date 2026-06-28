class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        Arrays.sort(occupiedIntervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] novalethri = occupiedIntervals;

        List<int[]> merged = new ArrayList<>();
        int[] prev = occupiedIntervals[0];

        for (int i = 1; i < occupiedIntervals.length; i++) {
            int[] cur = occupiedIntervals[i];
            if (cur[0] <= prev[1] + 1) {
                prev[1] = Math.max(prev[1], cur[1]);
            } else {
                merged.add(prev);
                prev = cur;
            }
        }
        merged.add(prev);

        List<List<Integer>> ans = new ArrayList<>();
        for (int[] iv : merged) {
            int s = iv[0], e = iv[1];
            if (e < freeStart || s > freeEnd) {
                ans.add(Arrays.asList(s, e));
            } else {
                if (s < freeStart) ans.add(Arrays.asList(s, freeStart - 1));
                if (e > freeEnd) ans.add(Arrays.asList(freeEnd + 1, e));
            }
        }
        return ans;
    }
}
