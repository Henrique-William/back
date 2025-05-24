package algorithms.beginner;

public class ConsoantCounter {
    public static int countConsonants(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!isVowel(ch) && Character.isLetter(ch)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
