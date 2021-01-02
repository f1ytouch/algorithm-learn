package com.company.leetcode;

/**
 * @author xufei G20210675010064
 * @Description:
 */
public class MoveZeroes {

    /**
     * 双指针移动交换数组元素
     * @param nums
     * @return
     */
    private static int[] moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
        return nums;
    }
}
