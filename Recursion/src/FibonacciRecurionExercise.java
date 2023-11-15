public class FibonacciRecurionExercise {

    private static long[] storedNumbers;


    public static void main(String[] args) {

        int n = 92;   // max for long
        storedNumbers = new long[n + 1];

        for (int i = 0; i <= n; i++) {
            System.out.println(fibonacci(i));
        }
    }

    private static long fibonacci(int n) {
        if (n <= 1) {  // base case
            return n;
        }
        if (storedNumbers[n] != 0) {
            return storedNumbers[n];
        }
        long fibonacciNumbers = fibonacci(n - 1) + fibonacci(n - 2);
        storedNumbers[n] = fibonacciNumbers;

        return fibonacciNumbers;
    }
}