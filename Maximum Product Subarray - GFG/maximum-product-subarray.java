//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution 
{
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) 
    {
        // code here
        long curMax = 1, curMin = 1;
        long max = Integer.MIN_VALUE;
        //
        for(int index=0;index<n;index++)
        {
            if(arr[index] < 0)
            {
                long temp = curMax;
                curMax = curMin;
                curMin = temp;
            }
            //
            curMax = Math.max(curMax*arr[index], arr[index]);
            curMin = Math.min(curMin*arr[index], arr[index]);
            //
            max = Math.max(max, curMax);
        }
        //
        return max;
    }
}