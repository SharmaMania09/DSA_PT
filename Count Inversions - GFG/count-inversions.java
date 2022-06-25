// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        return mergeSort(arr, 0, (int)N-1);
    }
    
    public static long mergeSort(long arr[], int low, int high)
    {
        long res = 0;
        
        if(low<high)
        {
            int mid = low+(high-low)/2;
            res += mergeSort(arr, low, mid);
            res += mergeSort(arr, mid+1, high);
            res += merge(arr, low, mid, high);
        }
        
        return res;
    }
    
    public static long merge(long[] arr, int low, int mid, int high)
    {
        long res = 0;
        
        int temp1 = mid-low+1;
        int temp2 = high - mid;
        
        long arr1[] = new long[temp1];
        long arr2[] = new long[temp2];
        
        for(int i=0;i<temp1;i++)
        {
            arr1[i] = arr[low+i];
        }
        
        for(int i=0;i<temp2;i++)
        {
            arr2[i] = arr[mid+i+1];
        }
        
        int i=0, j=0, k=low;
        
        while(i<temp1 && j<temp2)
        {
            if(arr1[i] <= arr2[j])
            {
                arr[k++] = arr1[i++];
            }
            else
            {
                arr[k++] = arr2[j++];
                res += temp1 - i;
            }
        }
        
        while(i<temp1)
        {
            arr[k++] = arr1[i++];
        }
        
        while(j<temp2)
        {
            arr[k++] = arr2[j++];
        }
        
        return res;
    }
}