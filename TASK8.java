public class TASK8 {

    public static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            int remainder = n % 2;
            binary.insert(0, remainder); // Insert remainder at the beginning
            n = n / 2;
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        int N = 13;
        String binaryResult = decimalToBinary(N);
        System.out.println("Binary = " + binaryResult);
    }
}
