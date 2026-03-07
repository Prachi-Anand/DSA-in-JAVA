class Solution {
    public int majorityElement(int[] nums) {
        
        int targetSum=nums.length/2;
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            int target=nums[i];
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==target){
                    count++;
                }
                if(count>targetSum)
                {
                    return nums[j];
                }
                
            }
            

        }
        return 0;
        
    }
}