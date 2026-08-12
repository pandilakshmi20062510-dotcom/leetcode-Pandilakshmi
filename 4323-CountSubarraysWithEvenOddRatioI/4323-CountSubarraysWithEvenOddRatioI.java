// Last updated: 12/08/2026, 20:27:12
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int even=0,odd=0;
            for(int j=i;j<n;j++){
                if(nums[j]%2==0)
                    even++;
                else
                    odd++;
            
            if(odd>0 && (long)even*b<=(long)odd*a){
                        ans++;
                }
            }
        }
        return ans;
    }
}
