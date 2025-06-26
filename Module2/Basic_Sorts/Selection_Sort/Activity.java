package Module2.Basic_Sorts.Selection_Sort;

public class Activity {

    public static void main(String[] args) {
        // Sample list of test scores
        int[] testScores = { 85, 92, 78, 96, 89, 73, 91 };

        // Call the method to sort in descending order
        selectionSortDescending(testScores);

        // Print the sorted scores
        System.out.print("Test scores sorted in descending order: ");
        for (int score : testScores) {
            System.out.print(score + " ");
        }
    }

    public static void selectionSortDescending(int[] arr) {
        // Task: Write the logic to sort the scores in descending order using selection
        // sort
        int length = arr.length;
        for (int sortedIndex = 0; sortedIndex < length - 1; sortedIndex++) {
            int maxIndex = sortedIndex;
            for (int check = sortedIndex + 1; check < length; check++) {
                if (arr[maxIndex] < arr[check]) {
                    maxIndex = check;
                }
            }
            if (maxIndex != sortedIndex) {
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[sortedIndex];
                arr[sortedIndex] = temp;
            }
        }
    }

}
