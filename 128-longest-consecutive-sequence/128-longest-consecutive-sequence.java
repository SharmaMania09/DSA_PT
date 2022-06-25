class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        
        int max = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]-1))
            {
                int count = 1;
                int toFind = nums[i]+1;
                
                while(set.contains(toFind))
                {
                    count++;
                    toFind++;
                }
                max = Math.max(count, max);
            }
        }
        
        return max;
        
    }
}