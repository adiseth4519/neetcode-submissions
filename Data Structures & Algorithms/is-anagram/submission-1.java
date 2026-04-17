class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] arr=new int[26];
        for(char k: s.toCharArray()){
           int idx= k-'a';
           arr[idx]+=1; 
        }
        for(char k: t.toCharArray()){
           int idx= k-'a';
           arr[idx]-=1; 
        }
        for(int i: arr){
            if(i!=0) return false;
        }
        return true;

    }
}
