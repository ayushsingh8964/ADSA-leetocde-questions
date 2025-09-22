public class PeakElementArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if ((i == 0 || arr[i] >= arr[i - 1]) && (i == n - 1 || arr[i] >= arr[i + 1])) {
                System.out.println("Peak element is: " + arr[i]);
                break;
            }
        }
    }
}
