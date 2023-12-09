public class CH1219{
    public static void main(String[] args) {
        int n = 5;
        double result = calculateSquareRootSum(n);
        System.out.println("f(5) = " + result);
    }

    public static double calculateSquareRootSum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be greater than or equal to 1.");
        }

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += Math.sqrt(i);
        }

        return sum;
    }
}
