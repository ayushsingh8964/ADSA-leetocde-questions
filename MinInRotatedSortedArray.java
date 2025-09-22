public class MinInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int min = findMin(arr);
        System.out.println("Minimum element is: " + min);
    }

    static int findMin(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return arr[left];
    }
}
