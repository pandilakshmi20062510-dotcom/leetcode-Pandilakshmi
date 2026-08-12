// Last updated: 12/08/2026, 20:34:37
class Solution {
    public boolean hasAlternatingBits(int n) {
    int lastbit= (n&1)==0?1:0;
        while (n>0){
            int cur=n&1;
            if(cur==lastbit)return false;
            lastbit=cur;
            n=n>>1;
        }
        return true;
    }
}