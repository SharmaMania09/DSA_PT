//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N)
    {
        // code here
        long maxSum = 0, curSum = 0;
        //
        for(int index=0;index<K;index++)
        {
            curSum += Arr.get(index);
        }
        //
        maxSum = Math.max(maxSum, curSum);
        //
        for(int index=K;index<Arr.size();index++)
        {
            curSum = curSum + Arr.get(index) - Arr.get(index-K);
            //System.out.println(curSum);
            maxSum = Math.max(curSum, maxSum);
        }
        //
        return maxSum;
    }
}