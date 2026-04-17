class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();
        for(int i=0; i<strs.length; i++){
            String s= strs[i];
            char[] a= s.toCharArray();
            Arrays.sort(a);
            String key= new String(a);
            if(map.containsKey(key)){
                map.get(key).add(s);
            }
            else{
                List<String> arr=new ArrayList<>();
                arr.add(s);
                map.put(key, arr);
            }
        }
        List<List<String>> res= new ArrayList<>();
        for(List<String> i: map.values()){
            res.add(i);
        }
        return res;
    }
}
