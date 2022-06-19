/*

If we want to find specific location wise like 5th row and 3rd column
Then, we can use permutation combination formula
i.e (r-1)C(r-1)

*/

/*

If we want to find the specific row
Then, we can use the formula
from i=1 to k
res *= (n-i);
res /= (i+1);

*/

class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        
        List<Integer> list, pre = null;
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        
        for(int i=0;i<numRows;i++)
        {
            list = new ArrayList<Integer>();
            
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                    list.add(1);
                else
                    list.add(pre.get(j) + pre.get(j-1));
            }
            pre = list;
            finalList.add(list);
        }
        return finalList;
    }
}