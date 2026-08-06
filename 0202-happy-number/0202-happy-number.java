class Solution {

    private int getSumNum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        while (true) {

            slow = getSumNum(slow);

            fast = getSumNum(fast);
            fast = getSumNum(fast);

            if (slow == fast) {
                break;
            }
        }

        return slow == 1;
    }
}