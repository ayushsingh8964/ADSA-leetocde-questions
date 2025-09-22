public class FirstHighestElement {
    public static void main(String[] args) {
        int[] arr = {10, 45, 23, 78, 56, 89, 24};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The first highest element in the array is: " + max);
    }
}
