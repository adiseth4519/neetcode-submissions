class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i: nums){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }
            else map.put(i, map.get(i)+1);
        }
        int[] ans=new int[k];
        int c=0;
        while(k>0){
            int max=-1;
            int key=0;
            for(int i: map.keySet()){
                if(map.get(i)>max){
                    max=map.get(i);
                    key= i;
                }
            }
            ans[c++]= key;
            map.remove(key);
            k--;
        }
        return ans;
        
    }
}
