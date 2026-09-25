class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> hs = new HashSet<>();
       for(int i=0;i<nums.length;i++)
       {
        hs.add(nums[i]);
       }
        int longest = 0;
        for(int num:hs)
        {
            if(!hs.contains(num-1)){
                int currNum = num;
                int count=1;
                while(hs.contains(currNum+1))
                {
                    count++;
                    currNum++;
                }
                longest = Math.max(longest,count);
            }
            
        }
        return longest;
       
        
    }
}