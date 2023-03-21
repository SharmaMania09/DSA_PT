//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            int v[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < N; j++) v[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            int ans[][] = ob.sortedMatrix(N, v);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution 
{
    int[][] sortedMatrix(int N, int Mat[][]) 
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        //
        int row = Mat.length;
        int col = Mat[0].length;
        //
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                list.add(Mat[i][j]);
            }
        }
        //
        Collections.sort(list);
        //
        int k = 0;
        //
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                Mat[i][j] = list.get(k);
                k++;
            }
        }
        //
        return Mat;
    }
};