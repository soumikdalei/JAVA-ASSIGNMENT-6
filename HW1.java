public class HW1 {

    public static char findFirstNonRepeatedChar(String str) {
        int[] charCount = new int[256]; // assuming ASCII character set
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCount[c]++;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount[c] == 1) {
                return c;
            }
        }
        return '\0'; // If no non-repeated character found, return null character
    }

    public static void main(String[] args) {
        String str = "Java";
        char firstNonRepeatedChar = findFirstNonRepeatedChar(str);
        System.out.println("The first non-repeated character in \"" + str + "\" is \"" + firstNonRepeatedChar + "\"");
    }

}
