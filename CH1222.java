public class CH1222{
    public static void main(String[] args) {
        double result = calculateTrigonometricValue();
        System.out.println("sin(π/6) + cos(π/3) = " + result);
    }

    public static double calculateTrigonometricValue() {
        double angle1 = Math.PI / 6;
        double angle2 = Math.PI / 3;
        double sinValue = Math.sin(angle1);
        double cosValue = Math.cos(angle2);

        return sinValue + cosValue;
    }
}
