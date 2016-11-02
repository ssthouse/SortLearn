package com.ssthouse;

/**
 * Created by ssthouse on 02/11/2016.
 */
public abstract class BaseSort {

    public abstract void sort(int[] numArray);

    public void swap(int[] numArray, int indexOne, int indexTwo) {
        int temp = numArray[indexOne];
        numArray[indexOne] = numArray[indexTwo];
        numArray[indexTwo] = temp;
    }
}
