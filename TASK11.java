public class TASK11 {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int result = lcm(a, b);
        System.out.println("LCM = " + result);
    }
}
