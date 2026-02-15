class Solution {
    public int maxArea(int[] height) {
         int maxWater=0;
        int n = height.length;
        int i=0;
         int j=n-1;
        while(i<j)
        {
           
            int width = j-i;
            int ht=Math.min(height[j],height[i]);
            int currWater = width*ht;
            if(height[i]<height[j])
            {
                i++;
            }
            else{
                j--;
            }

            maxWater = Integer.max(maxWater,currWater);
        }
        return maxWater;       
           
            
        
    }
}