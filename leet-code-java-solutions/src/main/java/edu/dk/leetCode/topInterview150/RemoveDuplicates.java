package edu.dk.leetCode.topInterview150;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int leftP = 0;
        int rightP = 1;

        if (nums.length < 2) {
            return nums.length;
        }

        int k = 1;
        while (rightP < nums.length) {
            if (nums[leftP] < nums[rightP]) {
                int t = nums[leftP+1];
                nums[leftP+1] = nums[rightP];
                nums[rightP] = t;

                k++;
                leftP++;
            }
            rightP++;
        }

        return k;
    }
}
