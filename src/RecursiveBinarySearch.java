public class RecursiveBinarySearch {

    // Method to perform a recursive binary search on a sorted array
    public static int recursiveBinarySearch(int[] arr, int low, int high, int target) {


        if (arr == null) { // Check if the array is null
            System.out.println("Error: The input array is null."); // This message is printed when arr is null
            return -1; // Return -1 to indicate an error
        }

        if (arr.length == 0) { // Check if the array is empty
            System.out.println("Error: The array is empty."); // This message is printed when arr is empty
            return -1; // Return -1 to indicate an error
        }

        if (low > high) { // Check if the search range is valid
            System.out.println("Error: Invalid search range. 'low' is greater than 'high'."); // This message is printed when the search range does not make sense
            return -1;  // Return -1 to indicate an error
        }


        int begin = low;    // initializing begin variable
        int end = high;     // intiailizing end variable
        int mid = (begin + end)/2;  // initialzing mid variable

        if (begin > end){   // This if condition is fulfilled when begin is greater than end
            return -1;      // When if condition is fulfilled, -1 is returned
        }else if(target == arr[mid]){   // This else if conditon is fulfilled when the target value is equal to the value at arr[mid]
            return mid;     // When the conditon is fulfilled, mid is returned
        }else if(target < arr[mid]){    // This else if condition checks if the target is lesser than arr[mid]
            return recursiveBinarySearch(arr, begin, mid - 1, target);  // Recursively call the binary search function on the left half of the array
        } else{ // If the target is larger than the element at the middle index, we go to this else block
            return recursiveBinarySearch(arr, mid + 1, end, target);    // Recursively call the binary search function on the right half of the array
        }
    }

    // This method tests the recursive binary search function
    public static void main(String[] args) {
        System.out.println("Recursive Binary Search");	// Print a message indicating that the recursive binary search is being performed

        int[] array = { 9, 32, 17, 52, 101 }; // This initializes an array with certain elements
        int target = 101; // The target is initialized
        // How the function is called
        int result = recursiveBinarySearch(array, 0, array.length - 1, target);

        if (result == -1) { // This checks if the result has a value of -1
            System.out.println("Element not present"); // This message is printed when the if condition in line 41 is fulfilled
        }
        else { // If result is not equal to -1, this condition is fulfilled
            System.out.println("Element found at index " + result); // This message is printed when the else condition is fulfilled
        }
    }
}
