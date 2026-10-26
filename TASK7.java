public class TASK7 {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        long factorialResult = factorial(N);
        System.out.println("Factorial = " + factorialResult);
    }
}
