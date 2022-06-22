class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int count = 0, majElement = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(count == 0)
                majElement = nums[i];
            if(nums[i] == majElement)
                count++;
            else
                count--;
        }
        
        return majElement;
    }
}