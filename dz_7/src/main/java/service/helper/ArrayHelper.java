package service.helper;

import java.util.Scanner;

import static service.MessageService.printFirstSizeValue;
import static service.MessageService.printQueryMessage;
import static service.helper.ScannerHelper.getNumb;

public class ArrayHelper {

    public int[] getBaseArray(Scanner sc) {

        printFirstSizeValue();
        int length = getNumb(sc);

        printQueryMessage();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            int element = getNumb(sc);
            array[i] = element;

        }
        return array;
    }

}
