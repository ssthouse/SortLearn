package com.ssthouse;

/**
 * Created by ssthouse on 03/11/2016.
 */
public class StraightInsertionSort extends BaseSort {

    @Override
    public int[] sort(int[] numArray) {
        for (int i = 0; i < numArray.length - 1; i++) {
            int curNum = numArray[i + 1];
            int j = i;
            while (j >= 0 && numArray[j] > curNum) {
                numArray[j + 1] = numArray[j];
                j--;
            }
            numArray[j + 1] = curNum;
//            for (int j = i; j >= 0; j--) {
//                if (numArray[j] > curNum) {
//                    numArray[j + 1] = numArray[j];
//                } else {
//                    numArray[j + 1] = curNum;
//                    break;
//                }
//            }
        }
        return numArray;
    }


}
