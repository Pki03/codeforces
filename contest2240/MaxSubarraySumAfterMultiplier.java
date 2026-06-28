class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;

        long[] mavireltho = new long[n];
        for (int i = 0; i < n; i++) mavireltho[i] = nums[i];

        long originalMax = kadane(nums);

        long ans = Math.max(originalMax,
                     Math.max(compute(nums, k, true),
                              compute(nums, k, false)));
        return ans;
    }

    private long kadane(int[] nums) {
        long best = Long.MIN_VALUE / 2;
        long cur = Long.MIN_VALUE / 2;
        for (int v : nums) {
            cur = Math.max(v, cur + v);
            best = Math.max(best, cur);
        }
        return best;
    }

    private long compute(int[] nums, int k, boolean multiply) {
        long NEG = Long.MIN_VALUE / 2;
        long normal = NEG, op = NEG, done = NEG;
        long ans = NEG;

        for (int v : nums) {
            long val = v;
            long t = multiply ? val * k : val / k;

            long nxtNormal = Math.max(val, normal + val);
            long nxtOp = Math.max(t, Math.max(normal, op) + t);
            long nxtDone = Math.max(val, Math.max(op, done) + val);

            normal = nxtNormal;
            op = nxtOp;
            done = nxtDone;

            ans = Math.max(ans, Math.max(op, done));
        }
        return ans;
    }
}
