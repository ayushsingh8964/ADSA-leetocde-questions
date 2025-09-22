public class MaxInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int max = findMax(arr);
        System.out.println("Maximum element is: " + max);
    }

    static int findMax(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) {
                left = mid;
            } else {
                right = mid - 1;
            }
            if (left == right - 1) {
                return Math.max(arr[left], arr[right]);
            }
        }
        return arr[left];
    }
}
