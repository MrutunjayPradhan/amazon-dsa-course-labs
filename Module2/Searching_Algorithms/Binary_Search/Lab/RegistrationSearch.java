package Module2.Searching_Algorithms.Binary_Search.Lab;
public class RegistrationSearch {

    Registration [] registrations;

    public RegistrationSearch() {
        Database db = new Database();
        registrations = db.getRegistrations();
    }

    public Registration search(String license){

        // Task Completed 1: Initialize the left index to zero
        int left =0;
        /* Task Completed 2: Initialize the the right index to the
                    length of the array minus 1 */
        int right = registrations.length-1;
        /* Task Completed 3: Implement the while loop to run until
                   until the left index is greater than the
                   right index  */

        while (left<=right) {

            /* Task Completed 4: Initialize the local variable middle to the
                     index halfway between the right and left
                     indices. */
            int middle = left +(right-left)/2;

            /* Task Completed 5: Use the String.compareTo( ) method to
                       compare the Registration object's license
                       at the middle index to the search() method
                       parameter, license. */
            int val = registrations[middle].license.compareTo(license);

            /* Task Completed 6: Create an IF/ELSE IF/ELSE statement to
                       evaluate compareTo() return value. */
            if(val ==0) {
            /* Task Completed 7: if there is a match, return that
                           Registration object */
                return registrations[middle];
            } else if (val < 0) {
            /* Task Completed 8: If the Registration license is less, shift
                           the left index to the mid plus 1 */
               left = middle+1;
            }else{
            /* Task Completed 9: If the Registration license is greater, shift
                           the right index to the mid minus 1 */
                right =middle-1;
            }
        }

        /* Task Completed 10: If the loop completes without finding a match return
                   null */
        return null;
    }

    public void printAll( ){
        for(Registration reg : registrations){
            System.out.println(reg);
        }
    }
    public static void main(String[] args) {

        String license = "GIG-1870";
        RegistrationSearch regSearch = new RegistrationSearch();
        System.out.println();

        /* Task Completed 11: Call the search() method with a license number to
                    search for. */
        Registration result =regSearch.search(license);

        // Task Completed 12: If the registration object is found print it
        if(result != null){
            System.out.println("Registration found ");
            System.out.println(result);
        }else{

        /* Task Completed 13: If the registration object is not found, print
               an error */
            System.out.println("Error: Registration not found for :"+license);
        }
        System.out.println();
    }

}