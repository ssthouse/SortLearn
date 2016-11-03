package com.ssthouse;

import java.util.Arrays;

/**
 * Created by ssthouse on 03/11/2016.
 */
public class SimpleSelectionSort extends BaseSort {


    @Override
    public void sort(int[] numArray) {
        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] > numArray[j]) {
                    swap(numArray, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] testArray = {9, 1, 5, 8, 3, 7, 4, 6, 2};
        SimpleSelectionSort simpleSelectionSort = new SimpleSelectionSort();
        simpleSelectionSort.sort(testArray);
        System.out.println(Arrays.toString(testArray));
    }
}
