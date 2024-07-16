package strings;

public class WordCount {
    public static void main(String[] args) {
        countWords("I love coding");
        reverseString("Hello world");
        capitalizeText("HeyIt'sMeTechieEmma");
    }

    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0 ; i--) {
            System.out.print(text.charAt(i));
        }
    }

    public static void capitalizeText(String text) {
        StringBuilder modifyText = new StringBuilder(text);

        for (int i = 0; i < modifyText.length(); i++) {
            if(i != 0 && Character.isUpperCase(modifyText.charAt(i))) {
                modifyText.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifyText);
    }
}
