//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }
        
        // Your code here
        HashMap<Character, Character> map = new HashMap<>();
        //
        for(int index=0;index<str1.length();index++)
        {
            if(map.containsKey(str1.charAt(index)))
            {
                char chStr1 = map.get(str1.charAt(index));
                char chStr2 = str2.charAt(index);
                //
                if(chStr1 != chStr2)
                {
                    return false;
                }
            }
            else if(!map.containsValue(str2.charAt(index)))
            {
                map.put(str1.charAt(index), str2.charAt(index));
            }
            else
            {
                return false;
            }
        }
        //
        return true;
    }
}