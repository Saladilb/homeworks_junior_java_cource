package service;

import service.helper.ArrayHelper;

import java.util.Scanner;

import static service.MessageService.printArrayBefore;
import static service.MessageService.startGetResultMessage;

public class ArrayService {

    ArrayHelper arrayHelper = new ArrayHelper();

    public int getElementsValuesMultipleInCase(Scanner sc) {
        int[][] array = arrayHelper.getBaseArray(sc);
        printArrayBefore(array);
        startGetResultMessage();
        return getMultipleResult(array);
    }

    private int getMultipleResult(int[][] array) {   //6. прозизведение четных элементов массива, стоящих на нечетных позициях.
        int multipleResult = 1;
        boolean isOddPosition = true;
        boolean isExistValues = false;
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (isOddPosition) {
                    if (valueIsEven(ints[j])) {
                        multipleResult *= ints[j];
                        isExistValues = true;
                    }
                    isOddPosition = false;
                } else
                    isOddPosition = true;
            }
        }
        return isExistValues ? multipleResult : 0;
    }

    private boolean valueIsEven(int anInt) {
        return anInt % 2 == 0;
    }

}
