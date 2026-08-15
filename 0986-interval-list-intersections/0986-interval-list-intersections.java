class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        ArrayList<int[]> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        // Dono lists mein jab tak interval available hain
        while (i < firstList.length && j < secondList.length) {

            // First list ke current interval ka start aur end
            int s1 = firstList[i][0];
            int e1 = firstList[i][1];

            // Second list ke current interval ka start aur end
            int s2 = secondList[j][0];
            int e2 = secondList[j][1];

            // Intersection ka start = dono starts mein bada
            int s = Math.max(s1, s2);

            // Intersection ka end = dono ends mein chhota
            int e = Math.min(e1, e2);

            // Agar start <= end hai to overlap/intersection hai
            if (s <= e) {
                ans.add(new int[]{s, e});
            }

            // Jiska end chhota hai, uska pointer aage badhao
            if (e1 <= e2) {
                i++;
            } else {
                j++;
            }
        }

        // ArrayList ko int[][] mein convert karke return karo
        return ans.toArray(new int[ans.size()][]);
    }
}