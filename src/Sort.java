import java.sql.Array;
import java.util.ArrayList;

public class Sort {
    public static int[] Selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        return arr;
    }

    public static int[] Bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

//    public static int[] Quick(int[] arr) {
//        if (arr.length <= 1) {
//            return arr;
//        }
//        int pivotIndex = arr.length / 2;
//        int pivot = arr[pivotIndex];
//
//        ArrayList less = new ArrayList<>(); // ???
//        ArrayList greater = new ArrayList<>(); // ???
//        int[] result = new Array[arr.length]; // ???
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i == pivotIndex) continue;
//            if (arr[i] < pivot) {
//                less.add(arr[i]);
//            } else {
//                greater.add(arr[i]);
//            }
//        }
//
//        return [...Quick(less), pivot, ...Quick(greater)] / JS
//    }
}
