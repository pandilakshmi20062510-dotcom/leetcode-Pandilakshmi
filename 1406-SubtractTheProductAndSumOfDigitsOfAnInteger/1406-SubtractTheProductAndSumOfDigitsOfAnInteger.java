// Last updated: 12/08/2026, 20:31:10
class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1;

        while(n>0){
            int rem = n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
        }

        return (prod - sum);    
    }
}