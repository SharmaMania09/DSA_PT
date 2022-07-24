class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        findAllSubsets(0, nums.length, nums, list, finalList);
        
        return finalList;
    }
    
    public static void findAllSubsets(int low, int high, int[] nums, List<Integer> list,                                                        List<List<Integer>> finalList)
    {
        if(low == high)
        {
            finalList.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[low]);
        findAllSubsets(low+1, high, nums, list, finalList);
        list.remove(list.size()-1);
        findAllSubsets(low+1, high, nums, list, finalList);
    }
    
}