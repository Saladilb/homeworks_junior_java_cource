package service;

public class MessageService {
    public static void printQueryMessage() {
        System.out.println("Now let's get Array With Minimum Element In Line Matrix . Please enter the array elements. When the length of the array is reached, the elements will automatically be filled in to a new row. We will notify you of the end of filling in the form.");
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
        System.out.println("Let's get rray With Minimum Element In Line Matrix : ");
    }

    public static void printArrayBefore(int[][] array) {
        System.out.println("You array before is:");
        printMatrix(array);
    }

    public static void printResult(int[] result) {
        System.out.println("Result is: ");
        printSimpleArray(result);
    }

    private static void printSimpleArray(int[] result) {
        for (int element : result) {
            System.out.print(element + " ");
        }
    }

    private static void printMatrix(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
