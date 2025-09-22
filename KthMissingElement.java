public class KthMissingElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 11};
        int k = 5;
        int missing = findKthMissing(arr, k);
        System.out.println(k + "th missing element is: " + missing);
    }

    static int findKthMissing(int[] arr, int k) {
        int missingCount = 0;
        int current = 1;
        int i = 0;
        while (true) {
            if (i < arr.length && arr[i] == current) {
                i++;
            } else {
                missingCount++;
                if (missingCount == k) {
                    return current;
                }
            }
            current++;
        }
    }
}
