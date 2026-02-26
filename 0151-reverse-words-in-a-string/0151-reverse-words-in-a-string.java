class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        int n=s.length();
        int start=0;
        int end=0;
        int i=n-1;
        StringBuilder result = new StringBuilder();
        while(i>=0&&n>=0)
        {
            while(i>=0&&s.charAt(i)==' ')//skip spaces
            {
                i--;
            }
            end=i;
            while(i>=0&&s.charAt(i)!= ' ')//find start
            {
                i--;
            }
            start=i+1;//traverse till space and space +1 will be the start
            result.append(s.substring(start,end+1));
            result.append(" ");
            i--;

        }
        return result.toString().trim();
        
    }
}