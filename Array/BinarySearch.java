public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int left = 0, right = arr.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found)
            System.out.println("Element not found");
    }
}
