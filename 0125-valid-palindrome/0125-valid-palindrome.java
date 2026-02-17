class Solution {
    public boolean isPalindrome(String s) {
        String p = s.toLowerCase();
        p = p.replaceAll("[^a-z0-9]","");
        StringBuilder sb = new StringBuilder(p);
        sb = sb.reverse();
        for(int i=0;i<p.length();i++){
            if(p.charAt(i)!=sb.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
}