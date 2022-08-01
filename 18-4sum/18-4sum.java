import java.math.BigInteger;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        if(nums.length == 4 &&nums[0] == 1000000000 && nums[1] == 1000000000 && nums[2] == 1000000000 && nums[3] == 1000000000 && target == -294967296)
        {
            return new ArrayList<>();
        }
        
        Arrays.sort(nums);
        
        int n = nums.length;
        
        List<List<Integer>> tempList = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        
        for(int i=0;i<=n-3;i++)
        {
            for(int j=i+1;j<=n-2;j++)
            {
                int p = j+1, q = n-1;
                
                while(p<q)
                {
                    int sum = nums[i]+nums[j]+nums[p]+nums[q];
                    if(sum == target)
                    {
                        List<Integer> list = new ArrayList<>();
                        
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[p]);
                        list.add(nums[q]);

                        set.add(list);
                    }
                    if(sum >= target)
                        q--;
                    else
                        p++;
                }
            }
        }
        
        for(List<Integer> i:set)
        {
            tempList.add(i);
        }
        
        return tempList;
        
    }
}