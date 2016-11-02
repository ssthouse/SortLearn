package com.ssthouse;

import java.util.Arrays;

/**
 * Created by ssthouse on 02/11/2016.
 */
public class BubbleSort extends BaseSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] testArray = {9, 1, 5, 8, 3, 7, 4, 6, 2};
        bubbleSort.sort(testArray);
        System.out.println(Arrays.toString(testArray));
    }

    @Override
    public void sort(int[] numArray) {
        for (int i = 0; i < numArray.length - 1; i++) {
            for (int j = 0; j < numArray.length - 1 - i; j++) {
                if (numArray[j] > numArray[j + 1])
                    swap(numArray, j, j + 1);
            }
        }
    }

}
