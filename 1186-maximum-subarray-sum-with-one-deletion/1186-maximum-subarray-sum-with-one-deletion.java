class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;

        if (n == 0) {
            return 0;
        }

        int noDel = arr[0];
        int oneDel = -1;
        int res = arr[0];

        for (int i = 1; i < n; i++) {
            int prevNoDel = noDel;

            noDel = Math.max(arr[i], noDel + arr[i]);
            oneDel = Math.max(prevNoDel, oneDel + arr[i]);

            res = Math.max(res, Math.max(noDel, oneDel));
        }

        return res;
    }
}