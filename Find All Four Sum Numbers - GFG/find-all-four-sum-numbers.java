//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution 
{
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) 
    {
        Arrays.sort(arr);
        int n = arr.length;
        // code here
        ArrayList<ArrayList<Integer>> finalList = new ArrayList<>();
        //
        for(int index1=0;index1<arr.length-3;index1++)
        {
            for(int index2=index1+1;index2<arr.length-2;index2++)
            {
                int start = index2+1;
                int end = n-1;
                //
                while(start<end)
                {
                    //
                    int sum = arr[index1]+arr[index2]+arr[start]+arr[end];
                    //
                    if(sum==k)
                    {
                        ArrayList<Integer> dummyList = new ArrayList<>();
                        //
                        dummyList.add(arr[index1]);
                        dummyList.add(arr[index2]);
                        dummyList.add(arr[start]);
                        dummyList.add(arr[end]);
                        //dummyList.add($);
                        //
                        if(!finalList.contains(dummyList))
                        {
                            finalList.add(dummyList);
                        }
                        //
                        start++;
                        end--;
                    }
                    else if(sum < k)
                    {
                        start++;
                    }
                    else
                    {
                        end--;
                    }
                }
            }
        }
        //
        return finalList;
    }
}