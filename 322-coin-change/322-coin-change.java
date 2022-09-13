class Solution 
{
    public int coinChange(int[] coins, int amount) 
    {
        if(amount == 0)
            return 0;
        
        if(coins.length == 0 || amount <= 0)
            return -1;
        
        int dp[] = new int[amount+1];
        
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        dp[0] = 0;
        
        for(int coinsInd = 0; coinsInd < coins.length; coinsInd++)
        {
            int i = coins[coinsInd];
            for(int j = i; j <= amount; j++)
            {
                if(dp[j - i] != Integer.MAX_VALUE)
                {
                    dp[j] = Math.min(dp[j], dp[j-i] + 1);
                }
            }
        }
        
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}