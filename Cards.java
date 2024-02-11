import java.util.Scanner;
import java.util.Arrays;
class Source {
    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int sortedArray1[] = getArrayInput(sizeArray1, scanner);        
        int sizeArray2 = scanner.nextInt();
        int sortedArray2[] = getArrayInput(sizeArray2, scanner);
      //  int sortedArray1[] = getArrayInput(sizeArray1, scanner);

        // Remove scanner.close() here

      

       int descendingMerge[] = mergeBothInDescendingOrder(sortedArray1, sortedArray2);

        for (int i = 0; i < descendingMerge.length; i++) {
            System.out.println(descendingMerge[i]);
}

        // Close the scanner when you're done with it

    }

    public static int[] getArrayInput(int size, Scanner scanner) {
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            //System.out.println( array[i]);
        }

        return array;
    }

    public static int[] mergeBothInDescendingOrder(int[] sortedArray1, int[]  sortedArray2) {
        int sor1=sortedArray1.length;
        int sor2=sortedArray2.length;
        int len=sortedArray1.length+sortedArray2.length;
        
     //   System.out.println(sor2);
        int[] new_array= new int[len];
        for(int k=0;k<sortedArray1.length;k++){
            new_array[k]=sortedArray1[k];
        }
        
        for (int k = sortedArray1.length; k < len; k++) {
    new_array[k] = sortedArray2[k - sortedArray1.length];
}       
        sort(new_array);
        return new_array;
    }
        public static int[] sort(int[] randomNumbers) {
        return mergeSort(randomNumbers, 0, randomNumbers.length - 1);
    }

    public static int[] mergeSort(int[] numbers, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSort(numbers, first, mid);
            mergeSort(numbers, mid + 1, last);

            merge(numbers, first, mid, last);
        }

        return numbers;
    }
    private static int[] merge(int[] numbers, int i, int m, int j) {
        int l = i; //inital index of first subarray
        int r = m + 1; // initial index of second subarray
        int k = 0; // initial index of merged array
        int[] t = new int[numbers.length];

        while (l <= m && r <= j) {
            if (numbers[l] >= numbers[r]) {
                t[k] = numbers[l];
                k++;
                l++;
            } else {
                t[k] = numbers[r];
                k++;
                r++;
            }
        }

        // Copy the remaining elements on left half , if there are any
        while (l <= m) {
            t[k] = numbers[l];
            k++;
            l++;
        }

        // Copy the remaining elements on right half , if there are any
        while (r <= j) {
            t[k] = numbers[r];
            k++;
            r++;
        }

        // Copy the remaining elements from array t back the numbers array
        l = i;
        k = 0;
        while (l <= j) {
            numbers[l] = t[k];
            l++;
            k++;
        }

        return numbers;
    }


}
