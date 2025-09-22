public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 2, 3};
        int candidate = 0, count = 0;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        int freq = 0;
        for (int num : arr) {
            if (num == candidate) freq++;
        }
        if (freq > arr.length / 2) {
            System.out.println("Majority element is: " + candidate);
        } else {
            System.out.println("No majority element");
        }
    }
}
