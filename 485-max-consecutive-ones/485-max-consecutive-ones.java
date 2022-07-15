class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 0;
        int countNoOfOne = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                countNoOfOne++;
                if(countNoOfOne>max)
                    max = countNoOfOne;
            }
            else
            {
                if(countNoOfOne>max)
                    max = countNoOfOne;
                countNoOfOne = 0;
            }
        }
        
        return max;
        
    }
}