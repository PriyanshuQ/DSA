class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int diff = Integer.MIN_VALUE;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
            }
            else if(prices[i]-min>diff){
                diff = Math.max(diff, prices[i]-min);
            }
        }
        return diff;

    }
}