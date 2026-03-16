class Solution {
    public int rob(int[] nums) {
        int prev=nums[0];;
        int prev2=0;
        
        for(int i=1;i<nums.length;i++){
            if(i==0){
                return 0;
            }
            int take=nums[i];
            if(i>1){
                take+=prev2;
            }
            int notTake=0+prev;
            int curr=Integer.max(take,notTake);
            prev2=prev;
            prev=curr;
        }
        return prev;
        
        
    }
}