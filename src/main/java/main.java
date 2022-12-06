import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your word, then i check it if it is palindrome.");
        String word = scanner.nextLine();
        reverse(word);

    }
    public static String reverse(String text) {

        char[] letters = new char[text.length()];

        int letterindex = 0;
        for (int i = text.length()-1; i >= 0 ; i--) {
            letters[letterindex] = text.charAt(i);
            letterindex++;
        }
        String reverse = "";
        for (int i = 0; i < text.length(); i++) {
            reverse = reverse + letters[i];

        }

        if (text.equals(reverse)) {
            System.out.println("Your word is palindrome");
        } else {
            System.out.println("Your word is not palindrome");
        }

        return reverse;
    }

}
