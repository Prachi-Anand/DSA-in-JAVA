class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> counts = new HashMap<>();
        HashMap <Character,Integer> countt = new HashMap<>();
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            char ch2 = t.charAt(i);
            if(counts.containsKey(ch))
            {
                counts.put(ch,counts.get(ch)+1);
            }
            else{
                counts.put(ch,1);
            }
             if(countt.containsKey(ch2))
            {
                countt.put(ch2,countt.get(ch2)+1);
            }
            else{
                countt.put(ch2,1);
            }
        }
        return counts.equals(countt);

        
    }
}