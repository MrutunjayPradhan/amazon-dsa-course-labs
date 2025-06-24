package Module2.Searching_Algorithms.Linear_Search;
import java.util.ArrayList;

public class Activity {

    public static void main(String[] args) {
        int[] arr = {};
        int target = 10; // Value to search for

        int[] indices = findAllOccurrences(arr, target);
        System.out.print("Find All Occurrences: ");
        if (indices.length > 0) {
            for (int index : indices) {
                System.out.print(index + " ");
            }
        } else {
            System.out.print("No occurrences found.");
        }
        System.out.println();
    }

    public static int[] findAllOccurrences(int[] arr, int target) {
        // Completed Task: : Implement this method to return all indices where the target value is found
        // You might want to use a list to collect indices and then convert it to an array
        // Consider returning an empty array if the target value is not found
        
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        if(n==0){
            return new int[] {};
        }
        for(int index =0; index<n; index++){
            if(arr[index]==target){
                result.add(index);
            }
        }
       int[] indicesArray = new int[result.size()];
       for(int i =0;i<result.size();i++){

       indicesArray[i]=result.get(i);
       }
       return indicesArray;
    }
}


