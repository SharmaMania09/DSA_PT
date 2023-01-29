//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution 
{
    public int longestkSubstr(String s, int k) 
    {
        // code here
        int n  = s.length();
        int start=0, end=0, ans=-1;
        HashMap<Character, Integer> map = new HashMap<>();
        //
        while(end<n)
        {
            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            end++;
            //
            if(map.size()==k)
            {
                int diff = end-start;
                ans = Math.max(ans, diff);
            }
            //
            while(map.size() > k && start<n)
            {
                char chStart = s.charAt(start);
                map.put(chStart, map.getOrDefault(chStart, 0)-1);
                //
                if(map.get(chStart)==0)
                {
                    map.remove(chStart);
                }
                start++;
                //
                if(map.size()==k)
                {
                    int diff = end-start;
                    ans = Math.max(ans, diff);
                }
            }
            //
        }
        //
        return ans;
    }
}