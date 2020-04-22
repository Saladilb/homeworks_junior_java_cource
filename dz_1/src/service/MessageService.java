package service;

public class MessageService {
    public void printQueryMessage() {
        System.out.println("Please insert prime number for multiply operation");
    }

    public void printErrorInt() {
        System.out.println("The information entered is incorrect. Please enter a prime number");
    }

    public void printErrorCount() {
        System.out.println("You must insert prime number before use get result, please try again");
    }

    public void printResult(int resultNumber) {
        System.out.println("Result is: " + resultNumber);
    }
}
