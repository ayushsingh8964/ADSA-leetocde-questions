public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        int maxProd = arr[0], minProd = arr[0], result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = maxProd;
            maxProd = Math.max(Math.max(arr[i], arr[i] * maxProd), arr[i] * minProd);
            minProd = Math.min(Math.min(arr[i], arr[i] * temp), arr[i] * minProd);
            result = Math.max(result, maxProd);
        }
        System.out.println("Maximum product subarray is: " + result);
    }
}
