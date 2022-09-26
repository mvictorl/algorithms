import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        final static int[] unsortedArray = new int[] {1, 4, 5, 8, 5, 1, 2, 7, 5, 2, 11};

        /**************** Search *******************/
        int[] unsortedArray = {1, 4, 5, 8, 5, 1, 2, 7, 5, 2, 11};
        int[] sortedArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int x = 14;

        System.out.println("Позиция первого вхождения числа " + x + " в массиве: " + Search.Linear(unsortedArray, x) + " (линейный поиск)");

        System.out.println("Позиция первого вхождения числа " + x + " в массиве: " + Search.Binary(sortedArray, x) + " (бинарный поиск)");

        System.out.println("Позиция первого вхождения числа " + x + " в массиве: " + Search.RecursiveBinary(sortedArray, x, 0, sortedArray.length) + " (рекурсивный бинарный поиск)");

        /****************** Sort *******************/
        int[] arr = {0,3,2,5,6,8,1,9,4,2,1,2,9,6,4,1,7,-1, -5, 23,6,2,35,6,3,32};
        System.out.println("Отсортированный массив: " + Arrays.toString(Sort.Selection(arr)) + " (сортировка перебором)");
        System.out.println("Отсортированный массив: " + Arrays.toString(Sort.Bubble(arr)) + " (пузырьковая сортировка)");

        /****************** Recursion *******************/
        long f = 10;
        System.out.println("Факториал " + f + " равен: " + Recursion.Factorial(f));
        System.out.println("Сумма чисел Фибоначчи до " + f + " равна: " + Recursion.Fibonachi(f));
    }
}