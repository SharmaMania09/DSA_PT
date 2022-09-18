class Solution 
{
    public int deleteAndEarn(int[] nums) 
    {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i], (int)map.getOrDefault(nums[i], 0)+1);
            set.add(nums[i]);
        }
        
        ArrayList<Integer> list = new ArrayList<>(set);
        
        Collections.sort(list);
        
        int earn1 = 0, earn2 = 0;
        
        for(int i=0;i<list.size();i++)
        {
            int curEarn = list.get(i) * (int)map.get(list.get(i));
            
            if(i>0 && ( list.get(i) == (list.get(i-1)+1 )))
            {
                int temp = earn2;
                earn2 = Math.max(curEarn + earn1, earn2);
                earn1 = temp;
            }
            else
            {
                int temp = earn2;
                earn2 = curEarn + earn2;
                earn1 = temp;
            }
        }
        
        return earn2;
    }
}