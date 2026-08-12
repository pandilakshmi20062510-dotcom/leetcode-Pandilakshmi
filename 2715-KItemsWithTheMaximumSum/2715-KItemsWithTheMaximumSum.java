// Last updated: 12/08/2026, 20:28:31
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int one = Math.min(numOnes, k);
        k -= one;
        int zero = Math.min(numZeros, k);
        k -= zero;
        int neg = k;
        return one - neg;
    }
}
