class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
     
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        Arrays.sort(nums);
        
        findAllSubsetsWithDupl(0, nums.length, nums, list, finalList);
        
        return finalList;
    }
    
    public static void findAllSubsetsWithDupl(int low, int high, int[] nums, List<Integer> list, 
                                             List<List<Integer>> finalList)
    {
        finalList.add(new ArrayList<>(list));
        for(int i=low;i<high;i++)
        {
            if(i!=low && nums[i]==nums[i-1])
                continue;
            list.add(nums[i]);
            findAllSubsetsWithDupl(i+1, high, nums, list, finalList);
            list.remove(list.size()-1);
        }
    }
}