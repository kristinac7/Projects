public class RecursionExercises {

    public static void main(String[] args) {


        System.out.println(count7(7177));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfThree(27));

    }


    /*
        Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops).
        Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
        while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    */
    public static int count7(int n) {
        if (7 > n)
            return 0;
        else {
            if (n % 10 == 7)
                return 1 + count7(n / 10);
        }
        return 0 + count7(n / 10);
    }


    // Given an integer n, return true if it is a power of two. Otherwise, return false.
    public static boolean isPowerOfTwo(int n) {        // O(log n)
        if (n == 1){
            return true;
        }
        if (n % 2 != 0 || n <= 0) {
            return false;
        } else {
            
         return isPowerOfTwo(n / 2);
        }
    }


    // Given an integer n, return true if it is a power of three. Otherwise, return false.
    public static boolean isPowerOfThree(int n) {
        if (n == 1){
            return true;
        }
        if (n <= 0 || n % 3 != 0){
            return false;
        } else {
            return isPowerOfThree(n / 3);
        }
    }
}

