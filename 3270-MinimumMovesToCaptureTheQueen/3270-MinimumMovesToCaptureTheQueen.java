// Last updated: 12/08/2026, 20:27:42
class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        //Condition for rook when queen is in same row
        if(a == e) {
            if(a != c) {
                return 1;
            }
            else if(b < d && d > f) 
                return 1;
            else if(b > d && d < f)
                return 1;
            else
                return 2;
        }
        //Condition for rook when queen is in same column
        if(b == f) {
            if(b != d) {
                return 1;
            }
            else if(a < c && c > e) 
                return 1;
            else if(a > c && c < e)
                return 1;
            else
                return 2;
        }
        //Condition when queen is being attacked by bishop directly
        if(Math.abs(c-e) == Math.abs(d-f)) {
            //Condition for checking whether the rook comes in between bishop or queen.
            if(a > Math.min(c,e) && a < Math.max(c,e)) {
                if((Math.abs(a-c) == Math.abs(d-b)) && (Math.abs(a-e) == Math.abs(b-f))) {
                    return 2;
                } else {
                    return 1;
                }
            }
            else {
                return 1;
            }
        }
        return 2;
    }
}