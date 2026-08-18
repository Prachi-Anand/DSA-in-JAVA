class Solution {
    public double myPow(double x, int n) {
        long N = n;

    if(n==0)
    {
        return 1;
    }
    if(n<0)
    {
        x=1/x;
        N=-N;
    }
    

    double half = myPow(x,(int)(N/2));
    double result = half*half;
    if(N%2==1)
    {
        result = x*result;
    }
    return result;

}
    
    


}