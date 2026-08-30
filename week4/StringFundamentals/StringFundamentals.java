public class StringFundamentals {
    public static boolean hasText(String value) {
        if (value == null) return false;
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isWhitespace(value.charAt(i))) return true;
        }
        return false;
    }

    public static String normalizeCourseCode(String code) {
        if (code == null) return null;
        return code.trim().toUpperCase();
    }

    public static int countOccurrences(String text, char target) {
        if (text == null) return 0;
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) count++;
        }
        return count;
    }

    public static int lengthOfLastWord(String text) {
        if (text == null) return 0;
        int index = text.length() - 1;
        while (index >= 0 && text.charAt(index) == ' ') index--;
        int length = 0;
        while (index >= 0 && text.charAt(index) != ' ') {
            length++;
            index--;
        }
        return length;
    }

    public static void reverseString(char[] characters) {
        if (characters == null) return;
        int left = 0;
        int right = characters.length - 1;
        while (left < right) {
            char temporary = characters[left];
            characters[left] = characters[right];
            characters[right] = temporary;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] word = {'j', 'a', 'v', 'a'};
        char[] oneCharacter = {'A'};
        System.out.println(hasText(null));
        System.out.println(hasText(""));
        System.out.println(hasText("   "));
        System.out.println(hasText(" Java "));
        System.out.println(normalizeCourseCode(" cs 101 "));
        System.out.println(normalizeCourseCode(null));
        System.out.println(countOccurrences("banana", 'a'));
        System.out.println(countOccurrences(null, 'a'));
        System.out.println(lengthOfLastWord("Hello World   "));
        System.out.println(lengthOfLastWord(""));
        System.out.println(lengthOfLastWord(null));
        reverseString(word);
        reverseString(oneCharacter);
        System.out.println(word);
        System.out.println(oneCharacter);
    }
}
