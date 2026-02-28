class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
        List<List<Integer>> ans = new ArrayList<>();
        combinations(0,candidates,target,ans,new ArrayList<>());
        return ans;

        
    }
    public void combinations(int index,int []arr,int target, List<List<Integer>> ans,List<Integer> DS)
    {
        
        if(index==arr.length)
        {
            if(target==0)
            {
               ans.add(new ArrayList<>(DS));
            }
            return;
        }
        if(arr[index]<=target)
        {
            DS.add(arr[index]);
            combinations(index,arr,target-arr[index],ans,DS);
            DS.remove(DS.size()-1);
        }
        combinations(index+1,arr,target,ans,DS);
    }
}