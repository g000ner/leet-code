package edu.dk.leetCode.topInterview150;

public class RemoveElement {
    public static void main(String[] args) {
        removeElement(new int[] {0,1,2,2,3,0,4,2}, 2);
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while (leftPointer <= rightPointer) {
            if (nums[leftPointer] == val) {
                while (rightPointer >= 0 && nums[rightPointer] == val) {
                    rightPointer--;
                }

                if (rightPointer <= leftPointer) {
                    break;
                }

                int t = nums[leftPointer];
                nums[leftPointer] = nums[rightPointer];
                nums[rightPointer] = t;
            }
            leftPointer++;
            k++;
        }

        return k;
    }
}
