class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int idx = 0, sumG = 0, sumC = 0, sum = 0;
        for (int i = 0; i < gas.length; i++) {
            sumG += gas[i];
            sumC += cost[i];
            sum += gas[i] - cost[i];
            if (sum < 0) {
                idx = i + 1;
                sum = 0;
            }
        }
        if (sumG < sumC) return -1;
        return idx;
    }
}