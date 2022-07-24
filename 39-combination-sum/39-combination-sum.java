class Solution {
    
    
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> finalList = new ArrayList<>();
        
        List<Integer> list = new ArrayList<>();
        
        findAllCombinations(0, candidates, target, list, finalList);  
        
        return finalList;
    }
    
    public void findAllCombinations(int low, int[] candidates, int target, List<Integer> list,                                              List<List<Integer>> finalList)
    {
        if(low == candidates.length)
        {
            if(target == 0)
            {
                finalList.add(new ArrayList<>(list));
            }
            return ;
        }
        if(candidates[low] <= target)
        {
            list.add(candidates[low]);
            findAllCombinations(low, candidates, target - candidates[low], list, finalList);
            list.remove(list.size() - 1);
        }
        findAllCombinations(low+1, candidates, target, list, finalList);
    }
    
}