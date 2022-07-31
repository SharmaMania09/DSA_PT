class Solution 
{
    public List<List<Integer>> permute(int[] nums) 
    {
        
        List<List<Integer>> finalList = new ArrayList<>();
        
        findPairs(0, nums.length, nums, finalList);
        
        return finalList;
    }
    public void findPairs(int low, int high, int[] nums, List<List<Integer>> finalList)
    {
        if(low == high)
        {
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                list.add(nums[i]);
            }
            finalList.add(list);
            return ;
        }
        for(int i=low; i<high; i++)
        {
            swap(i, low, nums);
            findPairs(low+1, high, nums, finalList);
            swap(i, low, nums);
        }
    }
    public void swap(int num1, int num2, int[] nums)
    {
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }
}