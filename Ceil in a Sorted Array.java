class Solution {
    public int findCeil(int[] arr, int x) {

        int low = 0;
        int high = arr.length - 1;

        // Answer ka index store karega
        // Initially -1 maan rahe hain
        int ans = -1;

        // Binary search
        while (low <= high) {

            // Middle index
            int mid = low + (high - low) / 2;

            // Agar arr[mid] x se greater ya equal hai
            // to ye ceil ho sakta hai
            if (arr[mid] >= x) {

                // Current index ko answer maan lo
                ans = mid;

                // Left side mein check karo
                // shayad isse bhi pehla ceil mil jaye
                high = mid - 1;

            } else {

                // arr[mid] x se chhota hai
                // isliye right side search karo
                low = mid + 1;
            }
        }

        // First occurrence of smallest element >= x
        return ans;
    }
}
