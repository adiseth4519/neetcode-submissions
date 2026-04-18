class Solution {
    public void solve(int i, List<Integer> sub, List<List<Integer>> arr, int[] nums){
        if(i>=nums.length){
            List<Integer> a=new ArrayList<>();
            for(int x: sub){
                a.add(x);
            }
            arr.add(a);
            return;
        }
        sub.add(nums[i]);
        solve(i+1, sub, arr, nums);
        sub.remove(sub.size()-1);
        solve(i+1, sub, arr, nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> arr=new ArrayList<>();
       List<Integer> sub= new ArrayList<>();
       solve(0, sub, arr, nums);
       return arr; 
    }
}
