public class RangeSumQueryImmutable {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) prefix[i] = prefix[i - 1] + arr[i];

        int left = 1, right = 3; // range [1,3]
        int sum = prefix[right] - (left > 0 ? prefix[left - 1] : 0);
        System.out.println("Range sum: " + sum);
    }
}
