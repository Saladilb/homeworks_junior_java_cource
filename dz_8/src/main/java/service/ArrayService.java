package service;

import service.helper.ArrayHelper;

import java.util.Scanner;

public class ArrayService {

    ArrayHelper arrayHelper = new ArrayHelper();

    public int getAverage(Scanner sc) {
        int[][] array = arrayHelper.getBaseArray(sc);
        MessageService.printArrayBefore(array);
        MessageService.startGetResultMessage();
        return getAverageNumbInArray(array);
    }

    private int getAverageNumbInArray(int[][] array) {   //получить среднее арифметическое в матрице
        int allElementsSum = 0;
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                allElementsSum+= ints[j];
            }
        }
        return allElementsSum/(array.length * array[0].length);
    }


}
