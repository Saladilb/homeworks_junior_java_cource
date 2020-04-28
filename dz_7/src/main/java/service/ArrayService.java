package service;

import service.helper.ArrayHelper;

import java.util.Scanner;

import static service.MessageService.printArrayBefore;
import static service.MessageService.startGetResultMessage;

public class ArrayService {

    ArrayHelper arrayHelper = new ArrayHelper();

    public int getResultCountMaxNumber(Scanner sc) {
        int[] array = arrayHelper.getBaseArray(sc);
        printArrayBefore(array);
        startGetResultMessage();
        return getResult(array);
    }

    private int getResult(int[] array) {   //количество локальных максимумов в массиве.
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                if (array[i] > array[i + 1]) {
                    result++;
                }
            } else if (i == array.length - 1) {
                if (array[i] > array[i - 1]) {
                    result++;
                }
            } else {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    result++;
                }
            }
        }
        return result;
    }

}
