package service;

import service.helper.ArrayHelper;

import java.util.Scanner;

import static service.MessageService.printArrayBefore;
import static service.MessageService.startGetSumMessage;

public class ArrayService {

    ArrayHelper arrayHelper = new ArrayHelper();

    public int getElementsValuesSum(Scanner sc) {
        int[][] array = arrayHelper.getBaseArray(sc);
        printArrayBefore(array);
        startGetSumMessage();
        return getSum(array);
    }

    public int getSum(int[][] array) {
        int sum = 0;
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                sum += ints[j];
            }
            System.out.println();
        }
        System.out.println();
        return sum;
    }

}
