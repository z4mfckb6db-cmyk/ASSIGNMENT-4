public class TASK3 {

    public static void printInvertedPyramid(int n) {
        for (int i = 0; i < n; i++) {
            int starsCount = 2 * (n - i) - 1;
            for (int j = 0; j < starsCount; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printInvertedPyramid(3);
    }
}
