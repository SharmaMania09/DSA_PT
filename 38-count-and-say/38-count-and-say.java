class Solution {
    public String countAndSay(int n) {
        
        if(n==1)
        {
            return "1";
        }
        String str = countAndSay(n-1);
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        String finalStr = "";
        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), (int)map.get(str.charAt(i))+1);
            }
            else
            {
                if(!map.isEmpty())
                {
                    for(Map.Entry hsmap : map.entrySet())
                    {
                        finalStr += hsmap.getValue();
                        finalStr += hsmap.getKey();
                    }
                    map = new LinkedHashMap<>();
                    map.put(str.charAt(i), 1);
                }
                else
                {
                    map = new LinkedHashMap<>();
                    map.put(str.charAt(i), 1);
                }
            }
        }
        // System.out.println("Before : "+finalStr);
        if(!map.isEmpty())
        {
            for(Map.Entry hsmap : map.entrySet())
            {
                finalStr += hsmap.getValue();
                finalStr += hsmap.getKey();
            }
        }
        // System.out.println("After : "+finalStr);
        return finalStr;
        
    }
}