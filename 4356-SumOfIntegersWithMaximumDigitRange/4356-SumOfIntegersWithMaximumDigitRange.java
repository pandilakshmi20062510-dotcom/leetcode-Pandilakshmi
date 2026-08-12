// Last updated: 12/08/2026, 20:26:50
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange=0,sum=0;
        for(int n: nums){
            int min=9,max=0,temp=n;
            while(temp>0){
                int d=temp%10;
                min=Math.min(min,d);
                max=Math.max(max,d);
                temp/=10;
            }
            maxRange=Math.max(maxRange,max-min);
        }
        for(int n:nums){
            int min=9,max=0,temp=n;
            while(temp>0){
                int d =temp%10;
                min=Math.min(min,d);
                max=Math.max(max,d);
                temp/=10;
            }
            if(max-min==maxRange)
                sum+=n;
        }
        return sum;
    }
}
        