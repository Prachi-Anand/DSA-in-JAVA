class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buy>prices[i])
            {
                buy=prices[i];

            }
            int sell=prices[i];
            int profit=sell-buy;
            if(profit>maxProfit)
            {
                maxProfit=profit;
            }
        }
        return maxProfit;
        
    }
}