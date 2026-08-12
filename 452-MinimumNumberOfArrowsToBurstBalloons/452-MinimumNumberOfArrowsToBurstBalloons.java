// Last updated: 12/08/2026, 20:37:01
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)-> Integer.compare(a[1],b[1]));
        //a[1]-b[1] Integer.compare(a[1],b[1])   both are same
        int n=0;
        long end=Long.MIN_VALUE;
        for(int[] baloon:points){
            if(baloon[0]<=end)
               continue;
            else{
                n++;
                end=baloon[1];
            }
        }
        return n;
    }
}