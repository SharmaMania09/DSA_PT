class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        
        int min = Integer.MIN_VALUE;
        
        boolean containsPositive = false;
        
        for(int i=0;i<n;i++)
        {
            if(nums[i] >= 0)
            {
                containsPositive = true;
                break;
            }
            if(nums[i] > min)
            {
                min = nums[i];
            }
        }
        
        if(containsPositive == false)
            return min;
        
        int cursum = 0;
        int maxsum = 0;
        
        for(int i=0;i<n;i++)
        {
            cursum += nums[i];
            if(cursum > maxsum)
                maxsum = cursum;
            if(cursum < 0)
                cursum = 0;
        }
        return maxsum;
    }
}