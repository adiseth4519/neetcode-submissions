class Solution {
    public void subset(int i, int[] nums, List<List<Integer>> ans, List<Integer> set){
        if(i>=nums.length){
            List<Integer> arr=new ArrayList<>();
            for(int x: set){
                arr.add(x);
            }
            ans.add(arr);
            return;
        }
        set.add(nums[i]);
        subset(i+1, nums, ans, set);
        set.remove(set.size()-1);
        while(i+1<nums.length && nums[i]==nums[i+1]) i++;
        subset(i+1, nums, ans, set);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> set=new ArrayList<>();
        subset(0, nums, ans, set);
        return ans;
    }
}
