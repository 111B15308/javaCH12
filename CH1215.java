public class CH1215 {
    public static void main(String[] args) {
        // 將浮點數轉換成字串
        float floatNumber = 123.45f;
        String convertedString = Float.toString(floatNumber);
        int stringLength = convertedString.length();
        System.out.println("Length of the String: " + stringLength);
    }
}
