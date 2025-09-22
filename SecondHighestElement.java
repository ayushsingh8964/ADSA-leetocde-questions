public class SecondHighestElement {
    public static void main(String[] args) {
        int[] arr = {10, 45, 23, 78, 56, 89, 24};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }
        System.out.println("The second highest element in the array is: " + second);
    }
}
