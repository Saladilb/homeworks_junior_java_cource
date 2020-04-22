package service;

import exception.CountException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingService {

    MessageService messageService = new MessageService();

    public int getResultNumber() {

        Scanner sc = new Scanner(System.in);
        int usersNumberCount = 0;
        int result = 0;
        messageService.printQueryMessage();
        while (sc.hasNext()) {
            try {
                int scNumb = sc.nextInt();
                usersNumberCount += 1;
                if (scNumb == -1) {
                    if (usersNumberCount > 1) {
                        sc.close();
                        return result;
                    } else throw new CountException();
                }
                if (scNumb <= 0) {
                    messageService.printErrorInt();
                } else {
                    if (usersNumberCount % 2 == 0) {
                        result += scNumb;
                    }
                }
            } catch (InputMismatchException e) {
                messageService.printErrorInt();
                sc.next();
            } catch (CountException e) {
                messageService.printErrorCount();
            }
        }
        return result;
    }
}
