class Solution {
    public void solve(List<Integer> arr, List<List<Integer>> ans, int target, int[] nums, int i){
        if(ans.contains(arr)) return;
        if(target==0){
            List<Integer> t=new ArrayList<>(arr);
            ans.add(t);
            return;
        }
        if(i>=nums.length || target<0) return;
        else{
        if(nums[i]<=target){
        arr.add(nums[i]);
        solve(arr, ans, target-nums[i], nums, i);
        arr.remove(arr.size()-1);
        }
        }
        solve(arr, ans, target, nums, i+1);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> arr=new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();
        solve(arr, ans, target, nums, 0);
        return ans;
    }
}
