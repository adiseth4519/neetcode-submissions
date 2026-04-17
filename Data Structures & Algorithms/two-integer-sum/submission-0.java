class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int t = target - nums[i];
            if(!map.containsKey(t)){
                map.put(nums[i], i);
            }
            else{
                ans[0]= map.get(t);
                ans[1] = i;
                return ans;
            }
        }
        return ans;
    }
}
