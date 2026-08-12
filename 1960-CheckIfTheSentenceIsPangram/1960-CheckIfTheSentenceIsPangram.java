// Last updated: 12/08/2026, 20:29:31
class Solution {
    public boolean checkIfPangram(String s) {
          if (s.length() < 26) {
            return false;
        }
        for (char i = 'a'; i <= 'z'; i++) {
            if (s.indexOf(i) == -1) {
                return false;
            }
        }
        return true;
    }
}
    