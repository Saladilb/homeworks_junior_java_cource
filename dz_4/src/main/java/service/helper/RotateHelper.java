package service.helper;

public class RotateHelper {

    public int[][] rotateArrayOnRight(int[][] array, int rows, int columns) {
        int[][] rotatedArray = new int[columns][rows];
        int rowCount = 0;
        int columnCount = rows - 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rotatedArray[rowCount][columnCount] = array[i][j];
                rowCount++;
            }
            rowCount = 0;
            columnCount--;
        }
        return rotatedArray;
    }
}