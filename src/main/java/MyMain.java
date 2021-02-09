import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        return isSortedRec(list, 0);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order

    
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        if (list.size() - 1 == i)
            return true;
        if (list.get(i) <= list.get(i + 1))
            return isSortedRec(list, i + 1);
        return false;
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        return hasCountCopiesRec(arr, x, count, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i) {
        if (arr.length == i)
            return (0 == count) ? true : false;
        if (arr[i] == x) 
            count--;
        return hasCountCopiesRec(arr, x, count, i + 1);
    }

    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        return binarySearchRec(arr, num, 0, arr.length);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {
        int middle = (upperBound - lowerBound) / 2 + lowerBound;        
        if (arr[middle] == num) 
            return true;
        if (lowerBound + 1 == upperBound)
            return false;
        return (arr[middle] < num) ? binarySearchRec(arr, num, middle, upperBound) : binarySearchRec(arr, num, lowerBound, middle);
        
    }

    public static void main(String[] args) {
        // You can test your code here
    } 
}
