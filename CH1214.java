public class CH1214 {
    public static void main(String[] args) {
        String originalString = "Habit is second nature.";
        int startIndex = originalString.indexOf("nature");

        if (startIndex != -1) {
            String resultSubstring = originalString.substring(startIndex, startIndex + "nature".length());
            System.out.println(originalString);
            System.out.println(resultSubstring);
        } else {
            System.out.println("Substring not found.");
        }
    }
}
