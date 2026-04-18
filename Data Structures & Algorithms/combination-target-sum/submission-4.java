class Solution {
    public void comb(int[] arr, int t, ArrayList<Integer> a, int i, List<List<Integer>> b){
        if(t==0){
            ArrayList<Integer> c=new ArrayList<>();
            for(int k: a){
                c.add(k);
            }
            b.add(c);
            return;
        }
        if(i >= arr.length){
            return;
        }
        else{
            if(arr[i]<=t){
                a.add(arr[i]);
                comb(arr, t-arr[i], a, i, b);
                a.remove(a.size()-1);
            }
            comb(arr, t, a, i+1, b);
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> b= new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
        comb(nums, target, a, 0, b);
        return b;
    }
}
