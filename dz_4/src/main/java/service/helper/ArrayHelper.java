package service.helper;

import java.util.Scanner;

import static service.helper.ScannerHelper.getNumb;

public class ArrayHelper {

    public int[][] getBaseArray(Scanner sc, int length, int width) {
        int[][] array = new int[length][width];
        int size = length * width;

        int columnCounter = 0;
        int rowCounter = 0;

        for (int i = 0; i < size; i++) {
            int element = getNumb(sc);
            if (columnCounter == width) {
                columnCounter = 0;
                rowCounter++;
            }
            array[rowCounter][columnCounter] = element;
            columnCounter++;
        }
        return array;
    }

}
