import java.util.Arrays;
import java.util.Scanner;

public class Project1 {

    static class SelectionSort {
        void selectionSort(int array[], int size) {
            for (int step = 0; step < size - 1; step++) {
                int min_idx = step;

                for (int i = step + 1; i < size; i++) {
                    if (array[i] < array[min_idx]) {
                        min_idx = i;
                    }
                }

                int temp = array[step];
                array[step] = array[min_idx];
                array[min_idx] = temp;
            }
        }
    }

    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = scnr.nextInt();
        int array[] = new int[n];

        System.out.println("Enter " + n + " numbers in the array, separated by spaces: ");

        for (int i = 0; i < n; i++) {
            array[i] = scnr.nextInt();
        }

        SelectionSort ss = new SelectionSort();
        ss.selectionSort(array, n);

        // Print the sorted array
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(array));

        System.out.println("Enter a key:");

        int x = scnr.nextInt();
        int keyIndex = binarySearch(array, n, x);

        if (keyIndex == -1) {
            System.out.println(x + " was not found.");
        } else {
            System.out.println("Found " + x + " at index " + keyIndex + ".");
        }
    }

    public static int binarySearch(int[] numbers, int numbersSize, int key) {
        int mid, low, high;
        low = 0;
        high = numbersSize - 1;

        while (high >= low) {
            mid = low + (high - low) / 2;

            if (numbers[mid] < key) {
                low = mid + 1;
            } else if (numbers[mid] > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
