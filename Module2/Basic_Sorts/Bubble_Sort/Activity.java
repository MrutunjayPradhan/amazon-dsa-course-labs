package Module2.Basic_Sorts.Bubble_Sort;
/*
 * Challenge: Using the bubble sort algorithm
Over to you! Suppose you have a list of heights of basketball players in centimeters, 
and you’re tasked with sorting them in descending order using the bubble sort algorithm.

You have the following data:

Heights: An array of integers representing the heights of basketball players [198, 185, 210, 176, 195].

The Main class with the initialized array for sorting has been provided to you.

Requirements
Let’s sort the basketball players! Complete these steps in the interactive code block:

TODO: Write the logic to sort the array heights[] in descending order using bubble sort.

Select Run to view the output.

Examine the output.
Reflection point 
The following output reflects the desired output for the challenge. 
Sorted heights in descending order: 210 198 195 185 176
If you didn’t get the desired output, take some time to troubleshoot your code.
Errors happen to everyone, even to the best software developers. Working through them is part of the job.

If you struggled, consider doing the following:

Minimize unnecessary comparisons: Use a flag (boolean variable) to track whether any swaps were made during a pass through the list. 
If no swaps occur, the list is sorted, and the algorithm can terminate early. 
This optimization can significantly reduce the number of comparisons needed, especially for nearly sorted lists.

Avoid redundant swaps: Ensure that swaps only occur when necessary (i.e., when two adjacent elements are out of order).
Unnecessary swaps can degrade performance and make the code less efficient. 

Handle edge cases carefully: Consider special cases such as an empty array or a single-element array.
These cases should be handled properly to avoid unnecessary computations or errors.

Keep the inner and outer loops separate: Clearly separate the inner and outer loops to avoid confusion.
The outer loop handles the number of passes, while the inner loop handles the comparisons and swaps within each pass.
Keeping these roles distinct improves code readability and maintainability.
 */
public class Activity {
    public static void main(String[] args) {
        int[] heights = {198, 185, 210, 176, 195};
        bubbleSortDescending(heights);
        
        System.out.print("Sorted heights in descending order: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
    }
	public static void bubbleSortDescending(int[] arr) {	

    //finding the length and modify it to valid index as indexing start from 0
    int length = arr.length-1;
    /*handling edge cases for containg single element or empty array with modified length
    if single element then the length is 0 as valid index and empty array length is -1 */

    if(length ==-1 && length ==0){
        return;
    }
    //clean counter naming  for inner and outer loop to improve readability
    for(int pass =0; pass<length;pass++){
        boolean notSwaped =true;
        for(int counter=0; counter<length-pass;counter++){
            //swap condition if arr[counter]<arr[counter+1] 
            //The condition is strict to avoid unnesseery swaps for same item 
            if(arr[counter]<arr[counter+1]){
                notSwaped=false;
                int temp = arr[counter];
                arr[counter]=arr[counter+1];
                arr[counter+1]= temp;
            }
        }
        //break the loop if not a single swap perform
        if(notSwaped){
            break;
        }
    }
}
}
