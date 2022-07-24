class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        Arrays.sort(candidates);
        
        findAllCombinations(0, candidates, target, list, finalList);
        
        return finalList;
    }
    
    public void findAllCombinations(int low, int[] candidates, int target, List<Integer> list,                                                  List<List<Integer>> finalList)
    {
        if(target == 0)
        {
            finalList.add(new ArrayList<>(list));
        }
        for(int i = low;i<candidates.length;i++)
        {
            if(i>low && candidates[i] == candidates[i-1])
                continue;
            if(candidates[i] > target)
                break;
            list.add(candidates[i]);
            findAllCombinations(i+1, candidates, target-candidates[i], list, finalList);
            list.remove(list.size() - 1);
        }
    }
}