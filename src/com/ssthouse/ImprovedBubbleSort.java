package com.ssthouse;

import java.util.Arrays;

/**
 * Created by ssthouse on 02/11/2016.
 */
public class ImprovedBubbleSort extends BaseSort {


    @Override
    public int[] sort(int[] numArray) {
        boolean isSorted = false;
        for (int i = 0; i < numArray.length - 1 && !isSorted; i++) {
            isSorted = true;
            for (int j = 0; j < numArray.length - 1 - i; j++) {
                if (numArray[j] > numArray[j + 1]) {
                    isSorted = false;
                    swap(numArray, j, j + 1);
                }
            }
        }
        return numArray;
    }

}
