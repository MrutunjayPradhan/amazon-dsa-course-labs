package Module2.Advanced_Sorts.Merge_Sort;

public class Activity {

    public static void mergeSort2(String[] arr, int start, int end) {
        // implement method here
        if (start < end) {
            int middle = start + (end - start) / 2;
            mergeSort2(arr, start, middle);
            mergeSort2(arr, middle + 1, end);
            merge2(arr, start, middle, end);
        }
    }

    public static void merge2(String[] arr, int left, int middle, int right) {
        // implement method here
        // initializing the length of leftArray and rightArray
        int leftLength = middle - left + 1;
        int rightLength = right - middle;

        String[] leftArray = new String[leftLength];
        String[] rightArray = new String[rightLength];

        for (int k = 0; k < leftLength; k++) {
            leftArray[k] = arr[left + k];
        }
        for (int k = 0; k < rightLength; k++) {
            rightArray[k] = arr[middle + 1 + k];
        }
        int i = 0, j = 0;

        while (i < leftLength && j < rightLength) {
            if (leftArray[i].length() <= rightArray[j].length()) {
                arr[left] = leftArray[i++];
            } else {
                arr[left] = rightArray[j++];
            }
            left++;
        }

        while (i < leftLength) {
            arr[left++] = leftArray[i++];
        }
        while (j < rightLength) {
            arr[left++] = rightArray[j++];
        }
    }

    public static void main(String[] args) {
        String[] arr = { "apple", "banana", "kiwi", "grapefruit", "pear", "orange" };
        mergeSort2(arr, 0, arr.length - 1);

        printArr(arr);
    }

    public static void printArr(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }
}