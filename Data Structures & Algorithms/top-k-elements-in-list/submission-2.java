class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i: nums){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }
            else map.put(i, map.get(i)+1);
        }
        ArrayList<Integer>[] bucket = new ArrayList[nums.length+1];
        for(int i: map.keySet()){
            int key = map.get(i);
            if(bucket[key]==null){
                ArrayList<Integer> arr=new ArrayList<>();
                arr.add(i);
                bucket[key]= arr;
            }
            else bucket[key].add(i);
        }
        int[] ans=new int[k];
        for(int i= nums.length; i>=0 && k>0; i--){
            if(bucket[i]!=null){
                for(int j: bucket[i]){
                    ans[k-1]= j;
                    k--;
                }
            }
        }
        return ans;

        
    }
}
