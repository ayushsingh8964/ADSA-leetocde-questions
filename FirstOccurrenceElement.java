public class FirstOccurrenceElement {
    public static void main(String[] args) {
        int[] arr = {5, 10, 10, 20, 20, 20, 30};
        int key = 20;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("First occurrence of " + key + " is at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
