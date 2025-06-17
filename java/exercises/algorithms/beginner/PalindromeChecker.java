package algorithms.beginner;

public class PalindromeChecker {
    public String isPalindrome(String str) {
        // Remove all special characters and convert to lowercase
        String formatedString = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        if (!formatedString.isEmpty()){
            int left = 0;
            int right = formatedString.length() - 1;

            while (left < right) {
                if (formatedString.charAt(left) != formatedString.charAt(right)) {
                    return "Não é um palíndromo";
                }
                left++;
                right--;
            }
        }
        return str + ". É um palíndromo";
    }
}
