class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> ans = new ArrayList<>();

        int n = intervals.length;
        int i = 0;

        // 1. Jo intervals newInterval se pehle hain
        for (; i < n && intervals[i][1] < newInterval[0]; i++) {
            ans.add(intervals[i]);
        }

        // 2. Overlapping intervals merge karo
        for (; i < n && intervals[i][0] <= newInterval[1]; i++) {

            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
        }

        // 3. Merged interval add karo
        ans.add(newInterval);

        // 4. Remaining intervals add karo
        for (; i < n; i++) {
            ans.add(intervals[i]);
        }

        return ans.toArray(new int[ans.size()][]);
    }
}