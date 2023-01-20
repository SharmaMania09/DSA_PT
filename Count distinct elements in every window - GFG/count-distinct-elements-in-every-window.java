//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> finalAnsList = new ArrayList<>();
        //
        for(int index=0;index<k;index++)
        {
            map.put(A[index], map.getOrDefault(A[index], 0)+1);
        }
        //
        finalAnsList.add(map.size());
        //
        for(int index=k;index<n;index++)
        {
            if(map.containsKey(A[index-k]))
            {
                if(map.get(A[index-k]) == 1)
                {
                    map.remove(A[index-k]);
                }
                else
                {
                    map.put(A[index-k], map.getOrDefault(A[index-k], 0)-1);
                }
            }
            //
            map.put(A[index], map.getOrDefault(A[index], 0)+1);
            //
            finalAnsList.add(map.size());
        }
        //
        return finalAnsList;
    }
}

