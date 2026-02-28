class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans  = new ArrayList<>();
        Arrays.sort(nums);
        subsets(0,nums,ans,new ArrayList<>());
        
        return ans;
        
    }
    public void subsets(int start, int[] arr,List<List<Integer>> ans, List<Integer> DS){
        ans.add(new ArrayList<>(DS));
    
        for(int i=start;i<arr.length;i++)
        {
             if(i>start&&arr[i]==arr[i-1])
             {
             continue;
             }
             DS.add(arr[i]);
             subsets(i+1,arr,ans,DS);
             DS.remove(DS.size()-1);
        }
    }
}