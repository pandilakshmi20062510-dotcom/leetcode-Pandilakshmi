// Last updated: 12/08/2026, 20:30:32
class Solution {
    public int[] runningSum(int[] nums) {
//         int i,sum=0;
//         int n=nums.length;
//         for(i=0;i<n;i++){
//         sum+=nums[i];
//         nums[i]=sum;}
//         return nums;
//     }
// }
//OR
int n=nums.length;
for(int i=1;i<n;i++)
nums[i]=nums[i]+nums[i-1];
return nums;
}
}