// The string is immutable means that we cannot change the object itself, but we can change the reference to the  // object.
// Security Parameters are typically represented as String in network connections, database connection URLs,      // usernames/passwords, etc. If it was mutable, these parameters could be changed easily.

class Solution {
    public String reverseWords(String s) {
        
        String[] strArr = s.trim().split("\\s+");
        
        String finalAns = "";
        
        int i = 0, j = strArr.length-1;
        
        while(i<=j)
        {
            swap(i, j, strArr);
            i++;
            j--;
        }
        
        for(int m=0;m<strArr.length-1;m++)
        {
            finalAns += strArr[m]+" ";
        }
        
        finalAns += strArr[strArr.length-1];
        
        return finalAns;
    }
    
    public static void swap(int i, int j, String[] strArr)
    {
        String temp = strArr[i];
        strArr[i] = strArr[j];
        strArr[j] = temp;
    }
    
}