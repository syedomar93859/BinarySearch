public class IterativeBinarySearch {

    // This is a method that performs binary search on a sorted array
    public static int iterativeBinarySearch(int[] arr, int target) {
        if (arr == null) {  // Check if the array is null
            System.out.println("Error: The input array is null."); // This message is printed when arr is null
            return -1; // Return -1 to indicate an error
        }

        if (arr.length == 0) { // Check if the array is empty
            System.out.println("Error: The array is empty."); // This message is printed when arr length is 0
            return -1; // Return -1 to indicate an error
        }

        int begin = 0;	//initializing begin variable
        int mid = 0;	//initializaing mid variable
        int last = arr.length - 1;	//initialzing and calculating last variable

        while(begin <= last) { // Start a while loop that keeps looping as long as begin is less than or equal to last
            mid = (begin + last)/2;	// This line calculates the middle index of the current search range
            if (arr[mid] < target) {	// If arr[mid] is smaller than target, then this if condition is fulfilled
                begin = mid + 1;	// change begin's value to mid + 1
            }else if(arr[mid] > target){	// If arr[mid] is greater than target, then this else if condition is fulfilled
                last = mid - 1;		// calculate last's new value with mid - 1
            } else{		// If the element at the middle index is equal to the target, we've foound the target
                return mid;	// Return the middle index as the result
            }
        }
        return -1;	// return -1 to indicate that the element was not found
    }

    // This method tests the binary search function
    public static void main(String[] args) {
        System.out.println("Iterative Binary Search");	// Print a message indicating that the iterative binary search is being performed

        int[] array = { 2, 3, 4, 10, 40 }; // This initializes an array with certain elements
        int target = 10; // The target is initialized
        // How the function is called
        int result = iterativeBinarySearch(array, target);

        if (result == -1) { // This checks if the result has a value of -1
            System.out.println("Element not present"); // This message is printed when the if condition in line 41 is fulfilled
        }
        else { // If result is not equal to -1, this condition is fulfilled
            System.out.println("Element found at index " + result); // This message is printed when the else condition is fulfilled
        }
    }
}