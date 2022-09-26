public class Recursion {
    public static long Factorial(long a) {
        if (a == 1) return 1;

        return a * Factorial(a - 1);
    }

    public static long Fibonachi(long a) {
        if (a == 1 || a == 2) return 1;

        return Fibonachi(a - 1) + Fibonachi(a - 2);
    }
}
