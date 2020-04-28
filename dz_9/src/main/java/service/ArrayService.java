package service;

import service.helper.ArrayHelper;

import java.util.Scanner;

public class ArrayService {

    ArrayHelper arrayHelper = new ArrayHelper();

    public int[] getResult(Scanner sc) {
        int[][] array = arrayHelper.getBaseArray(sc);
        MessageService.printArrayBefore(array);
        MessageService.startGetResultMessage();
        return getArrayWithMinimumElementInLineMatrix(array);
    }

    private int[] getArrayWithMinimumElementInLineMatrix(int[][] array) {   //9) Найти минимальный элемент в каждой строке матрицы
        int [] resultArray = new int [array.length];
        for (int i = 0; i  < array.length; i ++) {
            int min = array[i][0];
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
            resultArray[i] = min;
        }
        return resultArray;
    }


}
