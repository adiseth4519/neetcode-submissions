class Solution {
    public void perm(int i, int[] nums, List<List<Integer>> ans, List<Integer> set){
        if(i>=nums.length){
            List<Integer> arr=new ArrayList<>();
            for(int x: set){
                arr.add(x);
            }
            ans.add(arr);
            return;
        }
        for(int j=0; j<nums.length; j++){
            if(set.contains(nums[j])) continue;
            set.add(nums[j]);
            perm(i+1, nums, ans, set);
            set.remove(set.size()-1);
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> set=new ArrayList<>();
        perm(0, nums, ans, set);
        return ans;
    }
}
