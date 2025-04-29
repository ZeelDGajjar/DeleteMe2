package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] nums = {3, 1, 5, 2, 1, 4};
        bubbleSort(nums);    // {1, 1, 2, 3, 4, 5}

        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int[] nums) {
        bubbleSort(nums, true);
    }

    /**
     * bubbleSort method with 0(n^2)
     * @param nums the given int array
     */
    public static void bubbleSort(int[] nums, boolean ascending) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                boolean condition = ascending
                        ? nums[j] > nums[j + 1]
                        : nums[j] < nums[j + 1];
                if (condition) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    /**
     * SelectionSort method (O(n^2)):
     * 315214
     * 135214
     * 115234
     * 112534
     * 112354
     * 112345
     * @param nums the given int array
     */
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minidx = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minidx]) {
                    minidx = j;
                }
            }
            //swap nums[i] and nums[minIdx]
            int temp = nums[i];
            nums[i] = nums[minidx];
            nums[minidx] = temp;
        }
    }

    /**
     * Insertionsort (O(n^2))
     * 3     15214
     * 1     35214
     * 13    5214
     * 135   214
     * 135   514
     * 1235  14
     * 1123  54
     * 11234 5
     *
     * @param nums the given int array
     */
    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
}
