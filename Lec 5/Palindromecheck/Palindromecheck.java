import java.util.Scanner;

class Palindromecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: "); // Added a prompt for better user experience
        String a = sc.next();
        int b = a.length();
        boolean isPalindrome = true; // 1. Assume it's a palindrome initially

        for (int i = 0; i < b / 2; i++) {
            // 2. Use '==' to compare characters. If any pair doesn't match...
            if (a.charAt(i) != a.charAt(b - i - 1)) {
                isPalindrome = false; // ...set the flag to false...
                break; // ...and exit the loop immediately. No need to check further.
            }
        }

        // 3. Print the final result only ONCE, after the loop is done.
        if (isPalindrome) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

        sc.close(); // Good practice to close the scanner
    }
}