class Solution {
    public int minMeetingRooms(int[] start, int[] end) {

        // Start aur end times ko sort karo
        Arrays.sort(start);
        Arrays.sort(end);

        int n = start.length;

        int room = 0;
        int res = 0;

        int i = 0;  // start pointer
        int j = 0;  // end pointer

        while (i < n && j < n) {

            // Nayi meeting start ho gayi
            if (start[i] < end[j]) {

                room++;

                // Maximum rooms required
                res = Math.max(res, room);

                i++;
            }
            else {

                // Ek meeting khatam ho gayi
                room--;
                j++;
            }
        }

        return res;
    }
}
