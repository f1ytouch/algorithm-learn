package com.company.leetcode;

/**
 * @author G20210675010064
 * @Description:给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 */
public class Solution {
    public static void main(String[] args) {

    }

    /**
     * 暴力循环求解，时间复杂度O(n^2)
     * @param a
     * @return
     */
    public static int maxAreaOne(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length - 1; ++i) {
            for (int j = i + 1; j < a.length; ++j) {
                int area = (j - i)*Math.min(i, j);
                max = Math.max(area, max);
            }
        }
        return max;
    }

    /**
     * 数组两端往中间收敛，俗称中间夹逼
     * @param a
     * @return
     */
    public static int maxAreaTwo(int[] a) {
        int maxArea = 0;
        for (int i = 0, j = a.length - 1; i < j; ) {
            int minHeight = a[i] < a[j] ? a[i++] : a[j--];
            int area = (j - i + 1)*minHeight;
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}
