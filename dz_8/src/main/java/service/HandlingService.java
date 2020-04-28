package service;

import java.util.Scanner;

import static service.MessageService.printResult;

public class HandlingService {

    ArrayService arrayService = new ArrayService();

    public void handleTask() {
        Scanner sc = new Scanner(System.in);
        int result = arrayService.getAverage(sc);
        printResult(result);
    }

}
