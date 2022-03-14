package algorithms.array;

public class ArrayBinarySearch {
    static int binarySearch(int[] arr, int key) {
        int lo = 0, hi = arr.length - 1, mid = lo + (hi - lo) / 2;
        while (hi >= lo) {
            if (arr[mid] == key) return mid;
            else if (arr[mid] > key) hi = mid - 1;
            else lo = mid + 1;
            mid = lo + (hi - lo) / 2;
        }
        return -mid - 1;
    }
}
