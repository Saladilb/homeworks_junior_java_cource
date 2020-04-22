package service;

import exception.CountException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingService {

    MessageService messageService = new MessageService();

    public int getResultNumber() {

        Scanner sc = new Scanner(System.in);
        int usersNumberCount = 0;
        int result = 1;
        messageService.printQueryMessage();
        while (sc.hasNext()) {
            try {
                int scNumb = sc.nextInt();
                if (scNumb == -1) {
                    if (usersNumberCount != 0) {
                        sc.close();
                        return result;
                    } else throw new CountException();
                }
                if (scNumb <= 0) {
                    messageService.printErrorInt();
                } else {
                    if (isSumOfDigitsInNumberIsPrime(scNumb)) {
                        result *= scNumb;
                    }
                }
                usersNumberCount += 1;
            } catch (InputMismatchException e) {
                messageService.printErrorInt();
                sc.next();
            } catch (CountException e) {
                messageService.printErrorCount();
            }
        }
        return result;
    }

    private boolean isSumOfDigitsInNumberIsPrime(int scNumb) {
        char[] digits = String.valueOf(scNumb).toCharArray();
        int sumNumber = 0;
        for (char digit : digits) {
            sumNumber += Integer.parseInt("" + digit);
        }
        if (sumNumber < 4) {
            return true;
        }
        for (int i = 2; i < sumNumber; i++) {
            if (sumNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
