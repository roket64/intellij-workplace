package me.roket.tests.binarySearchExamples;

public class binarySearchExample {
    public static boolean binarySearch(int[] arr, int key) {
        int bottom = 0;
        int top = arr.length - 1;

        while (bottom <= top) {
            int mid = (bottom + top) / 2;

            if (arr[mid] < key) {
                bottom = mid + 1;
            } else if (arr[mid] > key) {
                top = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
