public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,6,10,18,19,21,65,78};
        int target = 78;
        System.out.println(binarySearch(array, target));
    }

    // ищет под каким индексом стоит заданное число
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = arr[mid];
            if (guess == target) {
                return mid;
            } else if (guess < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
