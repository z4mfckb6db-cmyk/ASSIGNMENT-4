public class TASK14 {

    public static long transformDigits(int n) {
        long result = 0;
        long multiplier = 1;

        while (n > 0) {
            int digit = n % 10;
            int transformedDigit;

            if (digit % 2 == 0) {
                transformedDigit = digit + 1;
            } else {
                transformedDigit = digit - 1;
            }

            result += transformedDigit * multiplier;
            multiplier *= 10;
            n /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        int input = 983210;
        System.out.println(transformDigits(input));
    }
}
