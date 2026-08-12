// Last updated: 12/08/2026, 20:31:38
class Solution {
    static final int[] days = new int[]{0,31,59,90,120,151,181,212,243,273,304,334,365};
    public int dayOfYear(String date) {
		var month = (date.charAt(5) - 48) * 10 + date.charAt(6) - 48;
		var day = (date.charAt(8) - 48) * 10 + date.charAt(9) - 48;
        var sum = days[month-1] + day;
        if (month < 3)
            return sum;

        var year = (date.charAt(2) - 48) * 10 + (date.charAt(3) - 48);
        var isLeap = year != 0;
        var half = ((date.charAt(0) - 48) * 10 + (date.charAt(1) - 48));
        year += half * 100;
        if (year % 4 == 0 && (isLeap || half % 4 == 0))
            return sum + 1;
        return sum;
    }
}