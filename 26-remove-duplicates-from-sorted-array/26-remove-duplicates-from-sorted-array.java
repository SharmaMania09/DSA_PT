class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i=0;
        int j=0;
        
        //int count=0;
        
        for(int k=0;k<nums.length;k++)
        {
            if(nums[i]==nums[j])
            {
                j++;
            }
            else
            {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                //count++;
            }
        }
        
        return i+1;
        
    }
}