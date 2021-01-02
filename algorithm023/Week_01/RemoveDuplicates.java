package com.company.leetcode;

/**
 * @author G20210675010064
 * @Description:
 */
public class RemoveDuplicates {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int q = 0;
            int p = 1;

            if (nums.length == 0 || nums == null) {
                return 0;
            }

            while (p < nums.length) {
                if (nums[q] != nums[p]) {
                    if (p - q > 1) {
                        nums[q + 1] = nums[p];
                    }
                    q++;
                }
                p++;
            }
            return q + 1;
        }
    }
}
