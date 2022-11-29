class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        return minimumPathSum(0, 0, grid.length, grid[0].length, grid, dp);
        
    }
    public static int minimumPathSum(int i, int j, int m, int n, int[][] arr, int[][] dp)
    {
        if(i==m-1 && j==n-1)
        {
            dp[i][j] =  arr[i][j];
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;

        if(dp[i][j] != 0)
        {
            return dp[i][j];
        }

        if(i+1 < m)
        {
            ans = Math.min(ans, minimumPathSum(i+1, j, m, n, arr, dp));
        }
        if(j+1 < n)
        {
            ans = Math.min(ans, minimumPathSum(i, j+1, m, n, arr, dp));
        }

        dp[i][j] = ans+arr[i][j];
        return dp[i][j];


    }
}