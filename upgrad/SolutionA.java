import java.util.Scanner;

public class SolutionA {
    private int size;
    private int[] array;

    // Constructor to initialize size and array
    public SolutionA(int size, int[] array) {
        this.size = size;
        this.array = array;
    }

    // Method to get and print results
    public void getResults() {
        int result = binarySearch();
        if (result == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println(result);
        }
    }

    // Binary search algorithm implementation
    private int binarySearch() {
        int start = 1;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid == array[mid]) {
                return mid;
            }
            if (mid < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // If not found
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting the size of the array from the user
        int size = scanner.nextInt();

        // Getting array elements from the user
        int[] array = getArrayInput(size, scanner);

        // Creating an instance of SolutionA class
        SolutionA solution = new SolutionA(size, array);

        // Calling getResults method to find and print results
        solution.getResults();

        scanner.close(); // Close the scanner when done
    }

    // Method to get array input from the user
    private static int[] getArrayInput(int size, Scanner scanner) {
        int[] array = new int[size + 1];

        
        for (int i = 1; i < size + 1; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }
}
