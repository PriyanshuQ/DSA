class Solution {
public:
    int numSubarrayProductLessThanK(vector<int>& nums, int k) {
        
        
        int low = 0;
        int high = 0;
        int count = 0;
        int product = 1;
        
        if(k<=1) return 0;
        
        while(high<nums.size())
        {
            
            product = product * nums[high];
            
            while(product>=k)
            {
                product = product/nums[low];
                low++;
            }
            count = count + 1 + (high-low);
            high++;
        }
        return count;
        
    }
};