/**
 * Exercise 1.7 - String Substring
 * How long is the string returned by:
 *     "I love java programming".substring(7, 11)
 *
 * Index breakdown:
 *   String :  I   l o v e   j a v a   p r o g r a m m i n g
 *   Index  :  0 1 2 3 4 5 6 7 8 9 10 11 ...
 *
 * substring(7, 11) takes characters from index 7 (inclusive)
 * to index 11 (exclusive), i.e. indices 7, 8, 9, 10.
 * The result is "java" and its length is 4.
 */
public class StringSubstring {
    public static void main(String[] args) {
        String original = "I love java programming";

        // Apply the expression from the question
        String result = original.substring(7, 11);

        // Display the result and its length
        System.out.println("The returned string is: \"" + result + "\"");
        System.out.println("The length of the string is: " + result.length());
    }
}
