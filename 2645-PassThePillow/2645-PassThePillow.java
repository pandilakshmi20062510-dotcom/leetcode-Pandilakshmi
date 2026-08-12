// Last updated: 12/08/2026, 20:28:36
class Solution {
    public int passThePillow(int n, int time) {
        return n-Math.abs(n-1-time%(n*2-2));
    }
}