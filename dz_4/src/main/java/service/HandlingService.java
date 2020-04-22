package service;

import java.util.Scanner;

import static service.MessageService.printRotatedArray;

public class HandlingService {

    ArrayService arrayService = new ArrayService();

    public void handleTask() {
        Scanner sc = new Scanner(System.in);
        int[][] result = arrayService.getRotatedArrayOnRight(sc);
        printRotatedArray(result);
    }
}
