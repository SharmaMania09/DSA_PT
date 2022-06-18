class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        
        int minimal = Integer.MAX_VALUE;
        int profit = 0;
        
        for(int i=0;i<n;i++)
        {
            if(prices[i] < minimal)
                minimal = prices[i];
            
            int temp = prices[i] - minimal;
            
            if(temp>profit)
                profit = temp;
        }
        
        return profit;
        
    }
}