package service;

public class MessageService {
    public void printQueryMessage() {
        System.out.println("Please insert number");
    }

    public void printErrorInt() {
        System.out.println("The information entered is incorrect. Please enter a number > 0");
    }

    public void printErrorCount() {
        System.out.println("You must insert one number before use get result, please try again");
    }

    public void printResult(int resultNumber) {
        System.out.println("Result is: " + resultNumber);
    }
}
