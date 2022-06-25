class Solution {
    public double myPow(double x, int n) {
        
        double ans = 1.0;
        
        long duplicateN = n;
        
        if(n<0)
        {
            duplicateN = -1 * duplicateN;
        }
        
        while(duplicateN > 0)
        {
            if(duplicateN%2 == 0)
            {
                x = x*x;
                duplicateN = duplicateN/2;
            }
            else
            {
                ans = ans * x;
                duplicateN -= 1;
            }
        }
        
        if(n<0)
        {
            return ((double)1.0/(double)ans);
        }
        
        return ans;
        
    }
}