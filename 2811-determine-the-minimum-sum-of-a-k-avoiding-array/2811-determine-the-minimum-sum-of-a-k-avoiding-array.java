class Solution {
    public int minimumSum(int n, int k) {
        int sum=0;
        Map<Integer, Integer> num = new HashMap<>();

        for(int i=1;num.size()<n;i++){
            if(!num.containsKey(k-i)){
                sum += i;
                num.put(i, 1);
            }
        }
        return sum;
    }
}