// Last updated: 12/08/2026, 20:36:41
class Solution {
    public int findComplement(int num) {
       int mask=0;
       int temp=num;
        while(temp>0){
            mask=(mask << 1)|1;
            temp >>= 1;
        }
        return mask^num;
    }
} 
