class Solution {
    public int rec(int l){
        String p=String.valueOf(l);
        int length=p.length();
        int result=0;
        for(int i=0;i<length;i++)
        {
            int digit=p.charAt(i)-'0';
            result+=digit*digit;


        }
        return result;

    }
    public boolean isHappy(int n) {
        while(n!=1&&n!=4){
            n=rec(n);
        }
        return n==1;
        
        
    }
}