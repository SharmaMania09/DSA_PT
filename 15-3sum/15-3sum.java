class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        
        
        
        HashSet<List<Integer>> set = new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        {
            int j = i+1;
            int k = nums.length-1;
            
            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0)
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    set.add(new ArrayList<>(list));
                    j++;
                    k--;
                }
                else if(sum > 0)
                    k--;
                else if(sum < 0)
                    j++;
            }
        }
        
        List<List<Integer>> finalList = new ArrayList<>(set);
        return finalList;
        
    }
}