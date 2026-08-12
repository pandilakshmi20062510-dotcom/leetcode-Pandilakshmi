// Last updated: 12/08/2026, 20:28:39
class Solution {
    public int numberOfCuts(int n) {
    
        if(n==1)
        return 0;
        if(n%2==0)
        return n/2;
        return n;
    }
}