//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        //
        for(int index=0;index<n;index++)
        {
            int start = index+1;
            int end = n-1;
            //
            while(start<n-1 && end >= 0 && start < end)
            {
                int sum = arr[index]+arr[start]+arr[end];
                //
                if(sum==0)
                {
                    // System.out.println(arr[index]+" "+arr[start]+" "+arr[end]);
                    return true;
                }
                else if(sum > 0)
                {
                    end--;
                }
                else
                {
                    start++;
                }
            }
        }
        //
        return false;
    }
}