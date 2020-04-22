package service;

public class MessageService {
    public static void printQueryMessage() {
        System.out.println("Now let's get multiple of elements. Please enter the array elements. When the length of the array is reached, the elements will automatically be filled in to a new row. We will notify you of the end of filling in the form.");
    }

    public static void printErrorInt() {
        System.out.println("The information entered is incorrect. Please enter a number");
    }

    public static void printFirstSizeValue() {
        System.out.println("Please write length of array");
    }

    public static void printSecondSizeValue() {
        System.out.println("Please write width of array");
    }

    public static void startGetResultMessage() {
        System.out.println("Let's get sum of all elements: ");
    }

    public static void printArrayBefore(int[][] array) {
        System.out.println("You array before is:");
        printArray(array);
    }

    public static void printResult(int result) {
        if (result == 0)
            printErrorResult();
        else
            System.out.println("Result is: " + result);

    }

    public static void printErrorResult() {
        System.out.println("No elements matching the condition were found, please try again use program ");
    }

    private static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
