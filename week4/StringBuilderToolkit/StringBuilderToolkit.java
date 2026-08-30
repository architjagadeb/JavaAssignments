public class StringBuilderToolkit {
    public static String reverse(String text) {
        if (text == null) return null;
        return new StringBuilder(text).reverse().toString();
    }

    public static String repeat(String text, int count) {
        if (text == null || count < 0) return null;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) builder.append(text);
        return builder.toString();
    }

    public static String joinWords(String[] words, String separator) {
        if (words == null || separator == null) return null;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) return null;
            if (i > 0) builder.append(separator);
            builder.insert(builder.length(), words[i]);
        }
        return builder.toString();
    }

    public static String removeCharacterAt(String text, int index) {
        if (text == null || index < 0 || index >= text.length()) return null;
        StringBuilder builder = new StringBuilder(text);
        builder.deleteCharAt(index);
        return builder.toString();
    }

    public static String replaceCharacterAt(String text, int index, char replacement) {
        if (text == null || index < 0 || index >= text.length()) return null;
        StringBuilder builder = new StringBuilder(text);
        builder.setCharAt(index, replacement);
        return builder.toString();
    }

    public static String buildNumberedList(String[] items) {
        if (items == null) return null;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) return null;
            builder.append(i + 1);
            builder.append(". ");
            builder.append(items[i]);
            if (i < items.length - 1) builder.append('\n');
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Java", "is", "fun"};
        String[] items = {"Book", "Pen", "Bag"};
        System.out.println(reverse("hello"));
        System.out.println(reverse(null));
        System.out.println(repeat("Hi ", 3));
        System.out.println(repeat("Hi", -1));
        System.out.println(joinWords(words, "-"));
        System.out.println(removeCharacterAt("Java", 1));
        System.out.println(replaceCharacterAt("Java", 0, 'L'));
        System.out.println(buildNumberedList(items));
        StringBuilder builder = new StringBuilder("Java");
        String result = builder.toString();
        builder.append(" Programming");
        System.out.println(result);
        System.out.println(builder);
    }
}
