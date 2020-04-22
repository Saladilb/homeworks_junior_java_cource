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
                if (scNumb <= 0 || numbIsNotPrime(scNumb)) {
                    messageService.printErrorInt();
                } else {
                    result = result * scNumb;
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

    private boolean numbIsNotPrime(int scNumb) {
        if (scNumb < 4) {
            return false;
        }
        for (int i = 2; i < scNumb; i++) {
            if (scNumb % i == 0) {
                return true;
            }
        }
        return false;
    }
}
