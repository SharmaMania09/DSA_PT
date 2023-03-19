//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String str = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.findSubString(str));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution 
{
    public int findSubString( String str) 
    {
        // Your code goes here
        HashSet<Character> set = new HashSet<>();
        
        //
        for(int index=0;index<str.length();index++)
        {
            set.add(str.charAt(index));
        }
        //
        int countOfDist = set.size();
        //
        int temp1 = 0, temp2 = 0, min = Integer.MAX_VALUE, startIndex = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        //
        while(temp2 < str.length())
        {
            map.put(str.charAt(temp2), map.getOrDefault(str.charAt(temp2), 0)+1);
            //
            if(map.size() == countOfDist)
            {
                //
                while((int)map.get(str.charAt(temp1)) > 1)
                {
                    char temp1Ch = str.charAt(temp1);
                    map.put(temp1Ch, map.get(temp1Ch) - 1);
                    temp1++;
                }
                //
                int len = temp2-temp1+1;
                //
                min = Math.min(min, len);
            }
            //
            temp2++;
        }
        //
        return min;
    }
}