class Solution {
    public void paran(int n, int open, int close, List<String> ans, String str) {
        if(str.length()==2*n){
            ans.add(str);
            return;
        }
        if(open < n){
            paran(n, open+1, close, ans, str+"(");
        }
        if(close < open){
            paran(n, open, close+1, ans, str+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        String str="";
        int open=0;
        int close=0;
        paran(n, open, close,  ans, str);
        return ans;
    }
}
