package service;

import service.helper.ArrayHelper;
import service.helper.RotateHelper;

import java.util.Scanner;

import static service.MessageService.*;
import static service.helper.ScannerHelper.getNumb;

public class ArrayService {

    RotateHelper rotateHelper = new RotateHelper();
    ArrayHelper arrayHelper = new ArrayHelper();

    public int[][] getRotatedArrayOnRight(Scanner sc) {

        printFirstSizeValue();
        int rows = getNumb(sc);
        printSecondSizeValue();
        int columns = getNumb(sc);

        int[][] array = getFilledArray(sc, rows, columns);

        printArrayBefore(array);
        startRotateArray();
        return rotateHelper.rotateArrayOnRight(array, rows, columns);
    }

    public int[][] getFilledArray(Scanner sc, int rows, int columns) {
        printQueryMessage();
        return arrayHelper.getBaseArray(sc, rows, columns);
    }

}
