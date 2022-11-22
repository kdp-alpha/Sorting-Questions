/*

Given an integer array where all its elements are sorted in increasing order except two swapped elements, in-place sort it in linear time. Assume there are no duplicates in the array.

Input : [3, 8, 6, 7, 5, 9] or [3, 5, 6, 9, 8, 7] or [3, 5, 7, 6, 8, 9]
Output: [3, 5, 6, 7, 8, 9]

*/

class Solution {
    public static void sortArray(int[] nums) {
        // Write your code here...
        if (nums.length <= 1) {
            return;
        }
        int x = -1;
        int y = -1;
        int prev = 0;
        for (int i = 1; i < nums.length; i++) {

            if (nums[prev] > nums[i]) {
                if (x == -1) {
                    x = i - 1;
                    y = i;

                } else {
                    y = i;
                }
            }
            prev = i;
        }
        if (x == -1 && y == -1) {
            return;
        }
        swap(nums, x, y);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
