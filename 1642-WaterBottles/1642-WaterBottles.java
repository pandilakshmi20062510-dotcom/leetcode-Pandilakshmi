// Last updated: 12/08/2026, 20:30:22
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = (numBottles-1)/(numExchange-1);
        return sum+numBottles;
    }
}