class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        combinations(0,candidates,target,ans, new ArrayList<>());
        return ans;

        
    }
    public void combinations(int index, int [] arr,int target,List<List<Integer>> ans,List<Integer> DS)
    {
       
            if(target==0)
            {
                ans.add(new ArrayList<>(DS));
                return;

        
        

        }
        for(int i=index;i<arr.length;i++)
        {
            if(i>index&&arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>target){
                break;
            }
            
                DS.add(arr[i]);
                combinations(i+1,arr,target-arr[i],ans,DS);
                DS.remove(DS.size()-1);
            
        }
    }
}