// Last updated: 12/08/2026, 20:29:20
class Solution {
    public boolean isThree(int n) {
        int cnt = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0) cnt++;
        }
        return cnt==3;
    }
}