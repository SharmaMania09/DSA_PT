class Solution 
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        Stack<Integer> stack = new Stack<>();
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=n2-1;i>=0;i--)
        {
            while(!stack.empty() && stack.peek()<=nums2[i])
                stack.pop();
            map.put(nums2[i], stack.isEmpty() ? -1 : stack.peek());
            stack.push(nums2[i]);
        }
        
        int ans[] = new int[n1];
        
        for(int i=0;i<n1;i++)
            ans[i]=map.get(nums1[i]);
        
        return ans;
    }
}