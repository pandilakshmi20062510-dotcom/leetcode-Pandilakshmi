// Last updated: 12/08/2026, 20:32:29
import java.util.*;

class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        Map<Long, Integer> rows = new HashMap<>();
        Map<Long, Integer> cols = new HashMap<>();
        Map<Long, Integer> diag = new HashMap<>();
        Map<Long, Integer> anti = new HashMap<>();
        Set<Long> on = new HashSet<>();

        for (int[] l : lamps) {
            long r = l[0], c = l[1];
            long key = r * n + c;

            if (on.add(key)) {
                rows.put(r, rows.getOrDefault(r, 0) + 1);
                cols.put(c, cols.getOrDefault(c, 0) + 1);
                diag.put(r - c, diag.getOrDefault(r - c, 0) + 1);
                anti.put(r + c, anti.getOrDefault(r + c, 0) + 1);
            }
        }

        int[] ans = new int[queries.length];

        int[][] dir = {
            {0,0},{0,1},{0,-1},{1,0},{-1,0},
            {1,1},{1,-1},{-1,1},{-1,-1}
        };

        for (int i = 0; i < queries.length; i++) {
            long r = queries[i][0];
            long c = queries[i][1];

            if (rows.getOrDefault(r, 0) > 0 ||
                cols.getOrDefault(c, 0) > 0 ||
                diag.getOrDefault(r - c, 0) > 0 ||
                anti.getOrDefault(r + c, 0) > 0) {
                ans[i] = 1;
            }

            for (int[] d : dir) {
                long nr = r + d[0];
                long nc = c + d[1];

                if (nr < 0 || nr >= n || nc < 0 || nc >= n)
                    continue;

                long key = nr * n + nc;

                if (on.remove(key)) {
                    rows.put(nr, rows.get(nr) - 1);
                    cols.put(nc, cols.get(nc) - 1);
                    diag.put(nr - nc, diag.get(nr - nc) - 1);
                    anti.put(nr + nc, anti.get(nr + nc) - 1);
                }
            }
        }

        return ans;
    }
}