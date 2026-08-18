class Solution {
    static long findPower( long a ,long b)
    {
        long m = 1000000007;
        if(b==0)
        {
            return 1;
        }
        long half=findPower(a,b/2);
        long result = (half * half)%m;
        if(b%2==1) //odd num
        {
            result = (a*result)%m; 

        }
        return result;

    }
    public int countGoodNumbers(long n) {
        long even = findPower(5,(n+1)/2);
        long odd = findPower(4,n/2);
        return (int) ((even*odd)%1000000007);

        
    }
}