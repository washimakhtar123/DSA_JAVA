import java.util.*;

class Solution {
    
    static boolean isIntersect(int[][] intervals) {

        // Start time ke according sort karo
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Empty ya single interval mein intersection nahi hoga
        if (intervals.length <= 1) {
            return false;
        }

        // Pehle interval ka end
        int e1 = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            int s2 = intervals[i][0];
            int e2 = intervals[i][1];

            // Agar previous interval ka end
            // current interval ke start se >= hai
            // to intersection hai
            if (e1 >= s2) {
                return true;
            }

            // Previous interval ka end update karo
            e1 = Math.max(e1, e2);
        }

        return false;
    }
}
