// Last updated: 12/08/2026, 20:31:30
import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>(map.values());

        return set.size() == map.size();
    }
}