class Solution {
    public void solve(int[] nums, int t, List<Integer> arr, List<List<Integer>> ans, int i){
        if(t==0){
            if(ans.contains(arr)) return;
            ArrayList<Integer> temp=new ArrayList<>();
            for(int x: arr){
                temp.add(x);
            }
            ans.add(temp);
            return;
        }
        if(i>=nums.length) return;
        else{
            int d=-1;
            if(nums[i]<=t){
            arr.add(nums[i]);
            solve(nums, t-nums[i], arr, ans, i+1);
            d= arr.remove(arr.size()-1);
            }
            while(i<nums.length-1 && nums[i+1]==d) i++;
            solve(nums, t, arr, ans, i+1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> arr=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        solve(candidates, target, arr, ans, 0);
        return ans;
    }
}
