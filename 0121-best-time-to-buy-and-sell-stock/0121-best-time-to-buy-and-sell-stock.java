class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxprofit = 0;
        for(int i=1;i<prices.length;i++)
        {
            if(buy>prices[i]){
                buy=prices[i];
            }
            int sell = prices[i];
            int profit = sell - buy;
            if(profit>maxprofit)
            {
                maxprofit = profit ;
            }  
        }
        return maxprofit;
        
    }
}