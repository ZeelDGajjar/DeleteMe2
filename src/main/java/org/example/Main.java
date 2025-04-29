package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] nums = {3, 1, 5, 2, 1, 4};
        selectionSort(nums);    // {1, 1, 2, 3, 4, 5}

        System.out.println(Arrays.toString(nums));
    }

    /**
     * bubbleSort method with 0(n^2)
     * @param nums the given int array
     */
    public static void bubblesort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length - 1 - i; j++) {
                if (nums[i] > nums[j + 1]) {
                    int temp = nums[i];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    /**
     * SelectionSort idea:
     * 315214
     * 135214
     * 125
     * @param nums the given int array
     */
    public static void selectionSort(int[] nums) {

    }
}