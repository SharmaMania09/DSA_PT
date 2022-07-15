class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        
        int leftPtr = 0;
        int rightPtr = n-1;
        
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
        
        int result = 0;
        
        while(leftPtr<rightPtr)
        {
           if(height[leftPtr]<=height[rightPtr])
           {
               if(leftMax<=height[leftPtr])
                   leftMax = height[leftPtr];
               else
               {
                   result += leftMax - height[leftPtr];
               }
               leftPtr++;
           }
            else
            {
                if(rightMax<=height[rightPtr])
                    rightMax = height[rightPtr];
                else
                {
                    result += rightMax - height[rightPtr];
                }
                rightPtr--;
            }
        }
        
        return result;
        
    }
}
