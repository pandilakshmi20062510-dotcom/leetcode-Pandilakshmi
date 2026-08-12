// Last updated: 12/08/2026, 20:26:57
class Solution {
    public boolean canReach(int[] start, int[] target) {
        int x1=start[0],y1=start[1];
        int x2=target[0],y2=target[1];
        return(x1+y1)%2==(x2+y2)%2;
    }
}