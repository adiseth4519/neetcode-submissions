class Solution {
    public void solve(List<Integer> arr, List<List<Integer>> ans, int sum, int target, int[] nums, int i){
        if(ans.contains(arr)) return;
        if(sum==target){
            List<Integer> t=new ArrayList<>(arr);
            ans.add(t);
            return;
        }
        if(i>=nums.length || sum>target) return;
        if(nums[i]<=target){
        arr.add(nums[i]);
        solve(arr, ans, sum+nums[i], target, nums, i);
        solve(arr, ans, sum+nums[i], target, nums, i+1);
        arr.remove(arr.size()-1);
        }
        solve(arr, ans, sum, target, nums, i+1);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> arr=new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();
        int sum=0;
        solve(arr, ans, sum, target, nums, 0);
        return ans;
    }
}
