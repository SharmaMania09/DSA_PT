class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();
        
        int temp1 = 0, temp2 = 0;
        
        int max = 0;
        
        while(temp1 < s.length())
        {
            if(!set.contains(s.charAt(temp1)))
            {
                set.add(s.charAt(temp1));
                temp1++;
                max = Math.max(max, set.size());
            }
            else
            {
                set.remove(s.charAt(temp2));
                temp2++;
            }
        }
        
        return max;
    }
}