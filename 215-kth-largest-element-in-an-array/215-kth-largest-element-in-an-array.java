class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i=0;i<nums.length;i++)
        {
            pqueue.add(nums[i]);
        }
        
        if(k==1)
            return pqueue.peek();
        for(int i=0;i<k-1;i++)
        {
            pqueue.poll();
        }
        
        return pqueue.peek();
        
    }
}