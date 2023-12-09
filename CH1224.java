public class CH1224{
    public static void main(String[] args) {
        String originalString = "Two heads are better than one.";
        int startIndex = originalString.indexOf("better");
        if (startIndex != -1) {
            String resultSubstring = originalString.substring(startIndex, startIndex + "better".length());
            System.out.println("Original String: " + originalString);
            System.out.println("Substring: " + resultSubstring);
        } else {
            System.out.println("Substring not found.");
        }
    }
}
