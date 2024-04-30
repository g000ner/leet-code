package edu.dk.leetCode.topInterview150;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int firstPointerIndex = m - 1;
        int secondPointerIndex = n - 1;
        int resultArrIndex = m + n - 1;

        while (secondPointerIndex >= 0) {
            if (firstPointerIndex >= 0 && nums1[firstPointerIndex] > nums2[secondPointerIndex]) {
                nums1[resultArrIndex--] = nums1[firstPointerIndex--];
            } else {
                nums1[resultArrIndex--] = nums2[secondPointerIndex--];
            }
        }
    }
}
