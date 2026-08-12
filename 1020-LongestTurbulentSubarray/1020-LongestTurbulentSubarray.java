// Last updated: 12/08/2026, 20:32:36
class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        if (n == 1) return 1;

        int max = 1, curr = 1;

        for (int i = 1; i < n; i++) {
            int c = Integer.compare(arr[i - 1], arr[i]);

            if (c == 0) {
                curr = 1;
            } else if (i == n - 1 || c * Integer.compare(arr[i], arr[i + 1]) != -1) {
                max = Math.max(max, curr + 1);
                curr = 1;
            } else {
                curr++;
            }
        }

        return max;
    }
}