class Solution 
{
    public int singleNonDuplicate(int[] nums) 
    {
        
        int low = 0, high = nums.length-1;
        
        while(low < high)
        {
            int mid = low+(high-low)/2;
            
            if(mid%2 == 1)
                mid--;
            
            // We didn't find a pair, that means single element will be on the left
            if(nums[mid] != nums[mid+1])
                high = mid;
            // Found a pair, that means single element can exist on right
            else
                low = mid+2;
        }
        
        return nums[low];
    }
}