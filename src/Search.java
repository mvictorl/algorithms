public class Search {
    public static int Linear(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public static int Binary(int[] arr, int item) {
        int start = 0;
        int end = arr.length;
        int middle;
        int pos = -1;

        while (start <= end) {
            middle = (start + end) / 2;
            if (arr[middle] == item) {
                pos = middle;
                return pos;
            }
            if (item < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return pos;
    }

    public static int RecursiveBinary(int[] arr, int item, int start, int end) {
        int middle = (start + end) / 2;

        if (item == arr[middle]) {
            return middle;
        }
        if (item < arr[middle]) {
            return RecursiveBinary(arr, item, 0, middle );
        } else {
            return RecursiveBinary(arr, item, middle, end);
        }
    }
}
