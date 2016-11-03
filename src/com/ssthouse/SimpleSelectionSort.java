package com.ssthouse;

/**
 * Created by ssthouse on 03/11/2016.
 */
public class SimpleSelectionSort extends BaseSort {


    @Override
    public int[] sort(int[] numArray) {
        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] > numArray[j]) {
                    swap(numArray, i, j);
                }
            }
        }
        return numArray;
    }
}
