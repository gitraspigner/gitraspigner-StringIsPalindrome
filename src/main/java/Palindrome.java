
public class Palindrome {
    /**
     * Palindromes are words that are the same forwards as they are backwards - eg, 'bob', 'racecar'.
     *
     * You can solve this problem in several ways:
     * You could start with a String reversal algorithm, which you have already written, and check if str is the same
     * as its reversed form, or, you could check if the character at the nth position of a String moving forwards
     * re the same as the nth position of a String moving backwards.
     *
     * @param str A String.
     * @return true if str is a palindrome, false otherwise.
     */
    public boolean pal(String str){
        int stringLength = str.length();
        int start = 0;
        int mid = stringLength/2;
        int end = stringLength-1;
        char[] charArray = str.toCharArray();

        if (stringLength == 2) {
            return (charArray[start] == charArray[end]); // if the 2 chars are the same, is a palindrome
        } else if (stringLength == 1) {
            return true; // 1 char, is a palindrome
        } else {
            for (   ; start < mid; start++,end--) {
                if (charArray[start] != charArray[end]) {
                    return false;
                }
            }
            return true;
        }
    }
}
