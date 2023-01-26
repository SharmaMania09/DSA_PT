//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            int ans[] = ob.sumClosest(arr, x);
            System.out.print(ans[0]+" "+ans[1]);
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    int[] sumClosest(int[] arr, int x) 
    {
        // code here 
        int finalArr[] = new int[2];
        //
        int start=0, end=arr.length-1;
        int minDiff=Integer.MAX_VALUE;
        //
        while(start < end)
        {
            int sum = arr[start]+arr[end];
            //
            if(Math.abs(sum-x) < minDiff)
            {
                minDiff = Math.abs(sum-x);
                //
                finalArr = new int[2];
                //
                finalArr[0] = arr[start];
                finalArr[1] = arr[end];
            }
            //
            if(sum < x)
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        //
        return finalArr;
    }
}