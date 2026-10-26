public class TASK12 {

    public static int reverseNumber(int n) {
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        int input = 1234;
        int result = reverseNumber(input);
        System.out.println(result);
    }
}
