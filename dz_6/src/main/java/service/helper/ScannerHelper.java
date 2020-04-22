package service.helper;

import java.util.InputMismatchException;
import java.util.Scanner;

import static service.MessageService.printErrorInt;

public class ScannerHelper {
    public static int getNumb(Scanner sc) {
        while (true) {
            if (sc.hasNext()) {
                try {
                    return sc.nextInt();
                } catch (InputMismatchException e) {
                    printErrorInt();
                    sc.next();
                }
            }
        }
    }
}
