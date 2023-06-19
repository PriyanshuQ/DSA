class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            if(i<k){
                pq.offer(nums[i]);
            }else if(pq.peek()<nums[i]){
                pq.poll();
                pq.offer(nums[i]);
            }
        }
        return pq.peek();
    }
}