package Module2.Basic_Sorts.Insertion_Sort;
public class Activity {
    public static void main(String[] args) {
        String[] names = {"Augusta", "Ria", "Jodee", "Sophia", "James"};
        insertionSortDescending(names);  // Fixed method name consistency
        
        System.out.print("Sorted names in reverse order: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }

    public static void insertionSortDescending(String[] namesArray) {
        int length = namesArray.length;
        for (int currentIndex = 1; currentIndex < length; currentIndex++) {
            String currentName = namesArray[currentIndex];
            int previousIndex = currentIndex - 1;
            
            while (previousIndex >= 0 && currentName.compareTo(namesArray[previousIndex]) > 0) {
                namesArray[previousIndex + 1] = namesArray[previousIndex];
                previousIndex--;
            }
            namesArray[previousIndex + 1] = currentName;
        }
    }
}