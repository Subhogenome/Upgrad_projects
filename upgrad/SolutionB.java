import java.util.Scanner;

public class SolutionB {
    private int[] array; // Array to store elements
    private int size;    // Size of the array
    
    // Constructor to initialize the array with given size
    public SolutionB(int size) {
        this.size = size;
        array = new int[size+1]; // Array initialization
    }
    
    // Method to set elements of the array using user input
    public void setArray(Scanner scanner) {
        for (int i = 1; i < size+1; i++) {
            array[i] = scanner.nextInt(); // Assigning input values to array elements
        }
    }
    
    // Method to perform binary search on the array
    public int binarySearch(int key) {
        int start = 1; // Start index of the search range
        int end = getArrayLength(array) - 1; // End index of the search range
        
        // Binary search algorithm
        while (start <= end) {
            int mid = (start + end) / 2; // Calculating the mid index
            if (key == array[mid]) { // If key is found at mid index
                return mid; // Return the index where key is found
            }
            if (key < array[mid]) { // If key is less than the element at mid index
                end = mid - 1; // Update the end index
            } else { // If key is greater than the element at mid index
                start = mid + 1; // Update the start index
            }
        }
        return -1; // Return -1 if key is not found in the array
    }

    // Method to get the length of the array
    public static int getArrayLength(int[] array) {
        int length = 0; // Initialize length variable
        try {
            while (true) {
                int element = array[length]; // Accessing array elements
                length++; // Incrementing length
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Index out of bounds indicates the end of the array
        }
        return length; // Return the length of the array
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object for user input
        
        int size = scanner.nextInt(); // Input size of the array
        int key = scanner.nextInt(); // Input key to search
        SolutionB binarySearch = new SolutionB(size); // Creating SolutionB object
        
        binarySearch.setArray(scanner); // Set array elements
        
        int result = binarySearch.binarySearch(key); // Perform binary search
        
        System.out.println(result); // Print the result
        
        scanner.close(); // Close the scanner
    }
}
