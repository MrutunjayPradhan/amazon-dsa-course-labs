package Module2.Searching_Algorithms.Binary_Search;
public class Activity {

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 40, 50};
        int target = 20;

        boolean multiple = hasMultipleOccurrences(arr, target);
        System.out.println("Has Multiple Occurrences: " + multiple);
    }

    public static boolean hasMultipleOccurrences(int[] arr, int target) {
        // Task Completed: implement the method to find if target is appearing more than once in arr
       
       
        int left = 0;
        int right = arr.length-1;
        while(left<=right){

        int middle = left +(right-left)/2;

            if(target == arr[middle]){
                if(middle>0 && arr[middle-1]==target || middle<arr.length-1 && arr[middle+1]==target){
                    return true;
                }else{
                    return false;
                }
            }else if(arr[middle]>target){
                right = middle-1;
            }else{
                left= middle+1;
            }
        }
        return false;
    }
}

