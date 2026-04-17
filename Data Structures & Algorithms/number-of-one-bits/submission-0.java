class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n>0){
            int a= n&1;
            if(a==1) c++;
            n>>=1;
        }
        return c;
    }

}
