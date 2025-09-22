public class LastOccurrenceElement {
    public static void main(String[] args) {
        int[] arr = {5, 10, 10, 20, 20, 20, 30};
        int key = 20;
        int index = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Last occurrence of " + key + " is at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
