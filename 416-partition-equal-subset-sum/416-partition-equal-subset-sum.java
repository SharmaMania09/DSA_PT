class Solution 
{
    public boolean canPartition(int[] nums) 
    {
        int sum = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
        }
        
        int n = sum/2;
        
        if( sum%2 != 0 )
            return false;
        
        boolean dp[] = new boolean[n+1];
        
        dp[0] = true;
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=n;j>0;j--)
            {
                if(j >= nums[i])
                {
                    dp[j] = dp[j] || dp[j - nums[i]];
                }
            }
        }
        
        return dp[n];
    }
}