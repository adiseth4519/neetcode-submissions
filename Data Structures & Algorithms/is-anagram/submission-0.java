class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map1=new HashMap<>();
        HashMap<Character, Integer> map2=new HashMap<>();
        for(char k: s.toCharArray()){
            if(!map1.containsKey(k)){
                map1.put(k, 1);
            }
            else map1.put(k, map1.get(k)+1);
        }
        for(char k: t.toCharArray()){
            if(!map2.containsKey(k)){
                map2.put(k, 1);
            }
            else map2.put(k, map2.get(k)+1);
        }
        for(char ch: map1.keySet()){
            if(!map1.get(ch).equals(map2.get(ch))) return false;
        }
        return true;
    }
}
