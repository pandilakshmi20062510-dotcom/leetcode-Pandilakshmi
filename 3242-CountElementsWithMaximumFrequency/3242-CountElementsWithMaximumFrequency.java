// Last updated: 12/08/2026, 20:27:50
import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int max = 0;
        for (int f : map.values()) {
            max = Math.max(max, f);
        }

        int ans = 0;
        for (int f : map.values()) {
            if (f == max) {
                ans += f;
            }
        }

        return ans;
    }
}