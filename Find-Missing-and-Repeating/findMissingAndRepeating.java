// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int ans[] = new int[2];
        
        for(int i=0;i<n;i++)
        {
            if(arr[Math.abs(arr[i])-1] < 0)
            {
                ans[0] = Math.abs(arr[i]);
                continue;
            }
            
            arr[Math.abs(arr[i])-1] = -1*arr[Math.abs(arr[i])-1];
            
        }
        
        for(int i=0;i<n;i++)
        {
            if(arr[i] > 0)
            {
                ans[1] = i+1;
                break;
            }
        }
        
        return ans;
        
    }
}
