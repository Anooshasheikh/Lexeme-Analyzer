import java.util.Scanner;

public class LexemeAnalyzer {

    // Keywords to recognize in the input
    private static final String[] keywords = {"if", "else", "do", "while", "for", "class", "int", "foat"};

    // Checks if a given word is a keyword
    public static boolean isKeyword(String word) {
        for (String keyword : keywords) {
            if (word.equals(keyword)) {
                return true;
            }
        }
        return false;
    }

    // Checks if a given word is a valid identifier
    public static boolean isIdentifier(String word) {
        if (word.length() == 0 || !isLetter(word.charAt(0))) {
            return false;
        }
        for (int i = 1; i < word.length(); i++) {
            if (!isLetterOrDigit(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // Check if character is a letter
    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    // Check if character is a digit
    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    // Check if character is a letter or digit
    public static boolean isLetterOrDigit(char c) {
        return isLetter(c) || isDigit(c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of input:");
        String input = scanner.nextLine();

        // Split input manually by spaces
        String[] words = input.split(" ");

        System.out.println("LEXEME\tTOKEN NAME");
        System.out.println("------\t----------");

        for (String word : words) {
            // Ignore empty words (due to extra spaces)
            if (word.isEmpty()) continue;

            if (isKeyword(word)) {
                System.out.println(word + "\tKeyword");
            } else if (isIdentifier(word)) {
                System.out.println(word + "\tIdentifier");
            } else {
                System.out.println(word + "\tERROR: Unrecognized Lexeme");
            }
        }

        scanner.close();
    }
}
